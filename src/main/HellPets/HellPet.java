package main.HellPets;

import main.Torturers.Torturer;

/**
 * Created by tieorange on 22/04/16.
 */
public class HellPet implements IFlying, IJumping {
    private HellPetType hellPetType;

    private String name;
    private HellPetColor color;
    private Torturer torturer;

    private int flyingSpeed;
    private int jumpingSpeed;

    public HellPet(String name, HellPetColor color, Torturer torturer, HellPetType hellPetType) {
        setName(name);
        setColor(color);
        setTorturer(torturer);
    }

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name is NULL");
        } else {
            this.name = name;
        }
    }

    public HellPetColor getColor() {
        return color;
    }

    public void setColor(HellPetColor color) {
        if (color == null) {
            throw new IllegalArgumentException("color is NULL");
        } else {
            this.color = color;
        }
    }

    public Torturer getTorturer() {
        return torturer;
    }

    public void setTorturer(Torturer torturer) {
        if (torturer != null) {
            if (this.torturer != torturer) {
                this.torturer = torturer;
                torturer.setHellPet(this);
            }
        } else {
            throw new IllegalArgumentException("torturer is NULL");
        }
    }
    //endregion

    //region Getter and Setter from Interface
    @Override
    public void setFlyingSpeed(int flyingSpeed) {
        if (flyingSpeed > 0) {
            this.flyingSpeed = flyingSpeed;
        } else throw new IllegalArgumentException("flyingSpeed should be > 0");
    }

    @Override
    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    @Override
    public void fly() {
        if (HellPetType.FLYING.equals(hellPetType)) {
            System.out.println("flying");
        } else throw new RuntimeException("HellPet is not a flying pet");
    }

    @Override
    public void setJumpingSpeed(int jumpingSpeed) {
        if (jumpingSpeed > 0) {
            this.jumpingSpeed = jumpingSpeed;
        } else throw new IllegalArgumentException("jumpingSpeed should be > 0");
    }

    @Override
    public int getJumpingSpeed() {
        return jumpingSpeed;
    }

    @Override
    public void jump() {
        if (HellPetType.JUMPING.equals(hellPetType)) {
            System.out.println("jumped");
        } else throw new RuntimeException("HellPet is not a jumping pet");

    }
    //endregion
}
