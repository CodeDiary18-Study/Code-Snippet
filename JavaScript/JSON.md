# JSON
> ### JSON.stringify(value[, replacer[, space]])
- 자바스크립트 값이나 객체를 JSON 문자열로 변환
- ```value```  
  JSON 문자열로 변환할 값(배열, 객체, 또는 숫자, 문자 등)
- ```replacer```  
  함수 또는 배열이 될 수 있음  
  이 값이 null이거나 없다면, 객체의 모든 속성들이 JSON 문자열 결과에 포함됨
- ```space```  
  서식 변경 목적으로 사용할 공백 문자 수  
  ```javascript
  let data = {
      name: "John",
      age: 30,
      roles: {
          isAdmin: false,
          isCustomer: true
      },
  };

  console.log(JSON.stringify(data, null, 2));
  /*
  {
    "name": "John",     
    "age": 30,
    "roles": {
      "isAdmin": false, 
      "isCustomer": true
    }
  }
  */
  ````


<br><br>

> ### 출처
- https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify
- https://steemit.com/kr-dev/@cheonmr/json-stringify
- https://sewonzzang.tistory.com/23
