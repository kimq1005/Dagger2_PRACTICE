# Dagger2_PRACTICE
1. build gradle setting -> JETPACKCOMPOSE_DAGGER2 확인

2. 디렉토리 구조 
      - data        
        1. di       
        2. model       
        3. network       
        4. repository 

       - domain       
          1. di       
          2. model       
          3. repository       
          4. use_case  
          
       - mappers      
       - presantation     
      1. screen   

3. data-> model  : 말그대로 모델 작성(DTO로 작성)
4. MainApplication 
5. data->di : Module 작성(retrofit)
  6. network-> ApiService 작성 : GET 및 POST 같은 API 요청 작성(suspend fun으로 Response로 요청)
7. domain->model 작성 : api 요청 말고 실질적으로 사용할 모델인듯
8. mappers -> mappers 작성 : 데이터를 맵핑
9. domain->repository에 Repo 생성 : 인터페이스 생성
10. data-> repository에 RepoImpl 생성 : domain-> repository의 Interface를 가져옴 이때 Utils의 SafeApiRequest를 호출함
11. domain->di에 DomainModule 작성
12. domain -> usecase에 UseCase 작성 이때 Utils의 Resource 호출로 SUCCESS, ERROR, LOADING 확인
13. viewmodel 생성 : USECASE 호출함 이때 @hiltViewModel로 호출 및 HomeState Holder를 생성해줌
 
