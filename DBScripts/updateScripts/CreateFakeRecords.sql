DELIMITER $$
CREATe PROCEDURE ABC()

   BEGIN
      DECLARE a INT Default 1 ;
                DECLARE pkey INT;
      simple_loop: LOOP
         insert into WeekDay (datecreated, AppUserId) values(date_add(Now(), INTERVAL -a DAY), 8);

                select WeekDayId into pkey from WeekDay order by WeekDayId desc limit 1;

                select pkey;

                insert into Meal (MealName, WeekDayID) values ('Default', pkey);

                select MealID into pkey from Meal order by MealID desc limit 1;

                insert into MealItem (MealID, MealItemName, TotalWeight, TotalCalories) values (pkey, 'Stuff', 100, 200);

         SET a=a+1;
         IF a=51 THEN
            LEAVE simple_loop;
         END IF;
   END LOOP simple_loop;
END $$


CALL `ABC`()