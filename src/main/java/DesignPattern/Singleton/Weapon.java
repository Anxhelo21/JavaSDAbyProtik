package DesignPattern.Singleton;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Weapon {
    private String name;
    private int damage;
    private int durability;
}
