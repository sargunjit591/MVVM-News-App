package com.example.mvvmnewsapp.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\nJ2\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/example/mvvmnewsapp/api/NewsAPI;", "", "getBreakingNews", "Lretrofit2/Response;", "Lcom/example/mvvmnewsapp/models/NewsResponse;", "countryCode", "", "pageNumber", "", "apiKey", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchForNews", "searchQuery", "app_debug"})
public abstract interface NewsAPI {
    
    @retrofit2.http.GET(value = "v2/top-headlines")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBreakingNews(@retrofit2.http.Query(value = "country")
    @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @retrofit2.http.Query(value = "page")
    int pageNumber, @retrofit2.http.Query(value = "apiKey")
    @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mvvmnewsapp.models.NewsResponse>> $completion);
    
    @retrofit2.http.GET(value = "v2/everything")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchForNews(@retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @retrofit2.http.Query(value = "page")
    int pageNumber, @retrofit2.http.Query(value = "apiKey")
    @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.mvvmnewsapp.models.NewsResponse>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}