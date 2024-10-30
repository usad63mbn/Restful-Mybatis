SpringBoot
-------------------
### Restful
CrossOrigin(CORS), @RequestBody와 Map<K,T>(TodoController2) / ResponseEntity<T>

### MyBatis
application.properties [dataSource + mybatis관련 설정(XXXmapper.xml 위치 포함)] -> SpringBoot가 XXXmapper.xml을 통해 빈 생성 <br>
mapper.xml 에서 SQL 쿼리 결과가 단일 객체인지, 리스트 형태인지는 메소드의 리턴 타입(@mapper가 붙은 클래스의 메소드)을 통해 자동으로 구분

### ResponseEntity<T>
Http 응답을 구성하기 위해 사용하는 클래스로, "상태 코드  + 응답 헤더 + 응답 본문 + 보안 및 캐싱 제어" 등 다양한 기능을 제공한다.
