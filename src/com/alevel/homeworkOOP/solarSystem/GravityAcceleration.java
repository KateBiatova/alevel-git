package com.alevel.homeworkOOP.solarSystem;

public interface GravityAcceleration {
// GravityAcceleration = Planet.gravConstant * Planet.mass / (Planet.radius * Planet.radius);

    default double acceleration() {
        return 0;
      }
}
