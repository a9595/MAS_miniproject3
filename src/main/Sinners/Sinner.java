package main.Sinners;

import main.SufferingProcess;

import java.util.*;

/**
 * Created by tieorange on 21/04/16.
 */
public class Sinner implements ILiar, IMurderer {
    private EnumSet<SinnerType> sinnerTypes;

    private Set<Sin> sinsSet = new HashSet<>(); // Composition
    private SufferingProcess sufferingProcess; // with attribute // TODO: List<main.SufferingProcess> for having a many to many collection (not 1 - *)
    private String firstName;
    private String lastName;
    private Date birthDate;

    private int amountOfLies;
    private int amountOfVictims;

    public Sinner(String firstName, String lastName, Date birthDate) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthDate(birthDate);
    }


    //region methods
    public void addSin(String name) {
        if (name != null) {
            sinsSet.add(new Sin(name));
        } else {
            throw new IllegalArgumentException("Name should not be null");
        }
    }

    public void removeSin(String name) {
        if (name != null) {
            for (Sin sin : sinsSet) {
                if (sin.getName().equals(name))
                    sinsSet.remove(sin);
            }
        } else {
            throw new IllegalArgumentException("Name should not be null");
        }
//        for(Iterator<Sin> sin = sinsSet.iterator() : sin. ){
    }
    //endregion


    //region Getter & setters
    public List<String> getSinsNames() {
        List<String> sinsNames = new ArrayList<>();
        for (Sin sin : sinsSet) {
            sinsNames.add(sin.getName());
        }
        return sinsNames;
    }

    public SufferingProcess getSufferingProcess() {
        return sufferingProcess;
    }

    public void setSufferingProcess(SufferingProcess sufferingProcess) {
        if (sufferingProcess == null) {
            throw new IllegalArgumentException("main.SufferingProcess is NULL");
        }
        if (sufferingProcess.getSinner() != this) {
            throw new IllegalArgumentException("main.SufferingProcess sinner is different");
        } else {
            this.sufferingProcess = sufferingProcess;
            if (sufferingProcess.getSinner() != this)
                sufferingProcess.setSinner(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("firstName is NULL");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("lastName is NULL");
        } else {
            this.lastName = lastName;
        }
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        if (birthDate == null) {
            throw new IllegalArgumentException("birthDate is NULL");
        } else {
            this.birthDate = birthDate;
        }
    }
    //endregion

    //region Getters and Setters and Methods from Interfaces
    @Override
    public void setAmountOfLies(int amountOfLies) {
        if (amountOfLies >= 0) {
            this.amountOfLies = amountOfLies;
        } else {
            throw new IllegalArgumentException("amountOfLies should be >= 0");
        }
    }

    @Override
    public int getAmountOfLies() {
        return amountOfLies;
    }


    @Override
    public void setAmountOfVictims(int amountOfVictims) {
        if (amountOfVictims >= 0) {
            this.amountOfVictims = amountOfVictims;
        } else {
            throw new IllegalArgumentException("amountOfVictims should be >= 0");
        }
    }

    @Override
    public int getAmountOfVictims() {
        return amountOfVictims;
    }

    @Override
    public void tryKill() {
        if (sinnerTypes.contains(SinnerType.MURDURER)) {
            System.out.println("Sinner killed another Sinner"); // TODO: mock
        } else throw new RuntimeException("Sinner is not a Murderer");
    }

    @Override
    public void tryToLie() {
        if (sinnerTypes.contains(SinnerType.LIER)) {
            System.out.println("Sinner lied to another Sinner"); // TODO: mock
        } else throw new RuntimeException("Sinner is not a liar");
    }
    //endregion

    private class Sin {
        private String name;

        public Sin(String name) {
            setName(name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name != null) {
                this.name = name;
            } else {
                throw new IllegalArgumentException("Name can't be null");
            }
        }
    }
}

