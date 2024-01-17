RemoteControlledCar

| Methods                                      | Member variables                | Scenario                                                                         | Output                                                 |
|----------------------------------------------|---------------------------------|----------------------------------------------------------------------------------|--------------------------------------------------------|
| setColour(String colour)                     | String colour                   | Owner wants to decide the colour of the car, gives a valid colour                | true                                                   |
|                                              |                                 | Owner wants to decide the colour of the car, gives a valid colour                | false                                                  |
| setBatteryType(boolean rechargeable)         | boolean rechargeableBattery     | Owner wants to decide if the batteries are rechargeable or not (i.e. disposable) | void                                                   |
| setRemoteControlDifficulty(boolean advanced) | boolean advancedRemoteControl   | Owner wants to decide if the remote control is advanced or not (i.e. simple)     | void                                                   |
| getCurrentBatteryPercentage()                | double currentBatteryPercentage | Owner wants to see the battery percentage remaining                              | A double representing the battery percentage remaining |
| moveForward(int meters)                      | int xCoordinate                 | Owner wants to move the car forward the specified no of meters                   | void                                                   |
| moveBackward(int meters)                     | int yCoordinate                 | Owner wants to move the car backwards the specified no of meters                 | void                                                   |
| stopMoving()                                 | boolean isMoving                | Owner wants to stop the car from moving                                          | void                                                   |
| turnRight()                                  | String direction                | Owner wants to turn the car right                                                | void                                                   |
| turnLeft()                                   |                                 | Owner wants to turn the car left                                                 | void                                                   |
