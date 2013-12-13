select * from appuser;

select * from weekday;

select * from meal;

select * from mealitem;



insert into appuser (Firstname, lastname, gender, dob, weight, height, activitylevel, targetweight)
values ('Skinny', 'Person', 'UN', '1843-10-10 00:00:00', 202, 202, 3, 195);


insert into weekday (datecreated, appuserid) values (NOW(), 1); 

insert into meal(mealdate, mealname, weekdayid) values (NOW(), 'Early Breakfast', 1);
insert into meal(mealdate, mealname, weekdayid) values (NOW(), 'Late Breakfast', 1);
insert into meal(mealdate, mealname, weekdayid) values (NOW(), 'Early Supper', 1);

insert into mealitem(mealid, mealitemname, totalweight, fatweight, carbweight, proteinweight, sodium)
values(1, 'apple', 112, 3, 32, 4, 0);
insert into mealitem(mealid, mealitemname, totalweight, fatweight, carbweight, proteinweight, sodium)
values(1, 'orange', 412, 3, 232, 14, 0);


insert into mealitem(mealid, mealitemname, totalweight, fatweight, carbweight, proteinweight, sodium)
values(2, 'roadkill', 3112, 323, 532, 443, 220);
insert into mealitem(mealid, mealitemname, totalweight, fatweight, carbweight, proteinweight, sodium)
values(2, 'sour orange', 1412, 3, 232, 14, 110);

insert into mealitem(mealid, mealitemname, totalweight, fatweight, carbweight, proteinweight, sodium)
values(3, 'Garbage', 3112, 3323, 532, 443, 2240);


