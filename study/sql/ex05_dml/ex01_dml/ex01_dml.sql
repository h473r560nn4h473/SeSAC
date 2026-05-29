-- INSERT
USE member_db;

INSERT INTO members (mem_id, mem_name, mem_number, addr, phone1, phone2, height, debut_date)
# 현재날짜시간 NOW() -> INSERT가 실행된 시간 / SYSDATE() -> SYSDATE() 함수가 실행된 시간
# SYSDATE()는 권장하지 않음
VALUES ('12345678', '홍길동', 1, 'KR', '010', '44445555', 180, NOW());

-- UPDATE
UPDATE members
SET mem_name = '김철수'
WHERE mem_id = '12345678';   -- 조건은 PK를 사용할 것

-- DELETE
DELETE FROM members
WHERE mem_id = '12345678';

INSERT INTO visit_history (mem_id, visited_at)
VALUES ('12345678', NOW());

INSERT INTO visit_history (visit_id, mem_id, visited_at)
VALUES (1, '12345678', NOW());

DELETE FROM visit_history
WHERE visit_id = 1;

SELECT * FROM visit_history;
SELECT * FROM members;