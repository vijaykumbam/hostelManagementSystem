INSERT INTO `hotelmanagement`.`roles` (`roleid`, `description`, `name`) VALUES ('1', 'Admin', 'Vijay');
INSERT INTO `hotelmanagement`.`roles` (`roleid`, `description`, `name`) VALUES ('2', 'SupV', 'Venkat');
INSERT INTO `hotelmanagement`.`roles` (`roleid`, `description`, `name`) VALUES ('3', 'User', 'Reddy');


INSERT INTO `hotelmanagement`.`usertable` (`userid`, `confirmpassword`, `dob`, `fname`, `gender`, `image`, `lname`, `login`, `mobilenumber`, `password`, `rolefk`) VALUES ('1', 'Vijay007@', '1999-04-02', 'venkat', 'M', 'gsdgsdgsg', 'Vijay', 'KUMBAVIJ', '9779316655', 'Vijay007@', '1');
INSERT INTO `hotelmanagement`.`usertable` (`userid`, `confirmpassword`, `dob`, `fname`, `gender`, `image`, `lname`, `login`, `mobilenumber`, `password`, `rolefk`) VALUES ('2', 'Ashok007@', '1999-04-02', 'Ashok', 'M', 'gsdgsdgsg', 'Reddy', 'KUMBASHOK', '9779316655', 'Ashok007@', '2');
INSERT INTO `hotelmanagement`.`usertable` (`userid`, `confirmpassword`, `dob`, `fname`, `gender`, `image`, `lname`, `login`, `mobilenumber`, `password`, `rolefk`) VALUES ('3', 'Lalitha007@', '1999-04-02', 'Lalitha', 'F', 'gsdgsdgsg', 'Reddy', 'KUMBAMLALI', '9779316655', 'Lalitha@', '1');


INSERT INTO `hotelmanagement`.`awarden` (`wardenid`, `hostelid`, `login`, `wardenname`, `userid`) VALUES ('1', '1', 'KUMBAVIJ', 'VIJAY', '1');
INSERT INTO `hotelmanagement`.`awarden` (`wardenid`, `hostelid`, `login`, `wardenname`, `userid`) VALUES ('2', '2', 'KUMBAMASHOK', 'ASHOK', '2');
INSERT INTO `hotelmanagement`.`awarden` (`wardenid`, `hostelid`, `login`, `wardenname`, `userid`) VALUES ('3', '3', 'KUMBAMLALITHA', 'LALITHA', '3');


INSERT INTO `hotelmanagement`.`hosteltable` (`hostelid`, `address`, `contact`, `description`, `fee`, `hostelname`, `hosteltype`) VALUES ('1', '20-22,MarketRoad,Hyderabad', '9779316655', 'Well known Boys Hostel for Students', '4500', 'SURYABOYS HOSTEl', 'Luxury');
INSERT INTO `hotelmanagement`.`hosteltable` (`hostelid`, `address`, `contact`, `description`, `fee`, `hostelname`, `hosteltype`) VALUES ('2', '20-22,MarketRoad,Hyderabad', '9779316655', 'Well known Boys Hostel for Students', '4500', 'KUMBAM HOSTEl', 'Luxury');
INSERT INTO `hotelmanagement`.`hosteltable` (`hostelid`, `address`, `contact`, `description`, `fee`, `hostelname`, `hosteltype`) VALUES ('3', '20-22,MarketRoad,Hyderabad', '9779316655', 'Well known Boys Hostel for Students', '4500', 'JAYASURYA HOSTEl', 'Luxury');


INSERT INTO `hotelmanagement`.`application` (`applicationid`, `address`, `description`, `hostel_name`, `name`, `qualification`, `hostelid`, `userid`) VALUES ('1', '22,MarketRoad,Nakrekal', 'I am a student willing to stay in hostel in my budget around 5k', 'SURYABOYS HOSTEL', 'Suma', 'Student', '1', '4');
INSERT INTO `hotelmanagement`.`application` (`applicationid`, `address`, `description`, `hostel_name`, `name`, `qualification`, `hostelid`, `userid`) VALUES ('2', '22,MarketRoad,Nakrekal', 'I am a student willing to stay in hostel in my budget around 5k', 'SURYABOYS HOSTEL', 'Suma', 'Student', '2', '4');
INSERT INTO `hotelmanagement`.`application` (`applicationid`, `address`, `description`, `hostel_name`, `name`, `qualification`, `hostelid`, `userid`) VALUES ('3', '22,MarketRoad,Nakrekal', 'I am a student willing to stay in hostel in my budget around 5k', 'SURYABOYS HOSTEL', 'Suma', 'Student', '3', '4');

