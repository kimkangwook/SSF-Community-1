INSERT INTO member(uid,pw,email,phone,grade,address,name,role,enabled,date)
VALUES ('ktf1686','7441686','rlarkddn1686@naver.com','01028811686',
        'n','신림','강욱','y'
           ,'y',now());

INSERT INTO board(no,title,content,date,category,views,uid)
VALUES ('1','1번게시글','게시글완성',now(),'1','1','ktf1686');