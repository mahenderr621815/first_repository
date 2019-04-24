DROP sequence item_rest_seq;

create sequence item_rest_seq start with 10 increment by 1;

Insert into MasterItems(ITEMID,ITEMNAME,ITEMDESCR,ITEMSTATUS,ITEMPRICE,ITEMIMAGE)values(100,'pizzas','small','active',200,'super');

