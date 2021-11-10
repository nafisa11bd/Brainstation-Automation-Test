CREATE TABLE STUDENTS
    (`id` int, `name` varchar(8), `marks` int)
;
    
INSERT INTO STUDENTS
    (`id`, `name`, `marks`)
VALUES
    (1, 'ashley', 81),
    (2, 'samantha', 75),
    (3, 'julia', 76),
    (4, 'belvet', 84)
;

select distinct name from STUDENTS where Marks > 75
order by substr(name, -3, length(name)), id;