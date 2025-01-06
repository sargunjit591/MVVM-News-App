package com.example.mvvmnewsapp.ui.theme.fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0002J\u001a\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020&H\u0002J\b\u0010-\u001a\u00020&H\u0002J \u0010.\u001a\u00020&*\u00020/2\u0014\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u00020&00R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00062"}, d2 = {"Lcom/example/mvvmnewsapp/ui/theme/fragments/SearchNewsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "_binding", "Lcom/example/mvvmnewsapp/databinding/FragmentSearchNewsBinding;", "binding", "getBinding", "()Lcom/example/mvvmnewsapp/databinding/FragmentSearchNewsBinding;", "isLastPage", "", "()Z", "setLastPage", "(Z)V", "isLoading", "setLoading", "isScrolling", "setScrolling", "newsAdapter", "Lcom/example/mvvmnewsapp/adapters/NewsAdapter;", "getNewsAdapter", "()Lcom/example/mvvmnewsapp/adapters/NewsAdapter;", "setNewsAdapter", "(Lcom/example/mvvmnewsapp/adapters/NewsAdapter;)V", "scrollListner", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getScrollListner", "()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "viewModel", "Lcom/example/mvvmnewsapp/ui/theme/NewsViewModel;", "getViewModel", "()Lcom/example/mvvmnewsapp/ui/theme/NewsViewModel;", "setViewModel", "(Lcom/example/mvvmnewsapp/ui/theme/NewsViewModel;)V", "hideProgressBar", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupRecyclerView", "showProgressBar", "onTextChanged", "Landroid/widget/EditText;", "Lkotlin/Function1;", "Landroid/text/Editable;", "app_debug"})
public final class SearchNewsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.example.mvvmnewsapp.databinding.FragmentSearchNewsBinding _binding;
    public com.example.mvvmnewsapp.ui.theme.NewsViewModel viewModel;
    public com.example.mvvmnewsapp.adapters.NewsAdapter newsAdapter;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "SearchNewsFragment";
    private boolean isLoading = false;
    private boolean isLastPage = false;
    private boolean isScrolling = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener scrollListner = null;
    
    public SearchNewsFragment() {
        super();
    }
    
    private final com.example.mvvmnewsapp.databinding.FragmentSearchNewsBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mvvmnewsapp.ui.theme.NewsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mvvmnewsapp.ui.theme.NewsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mvvmnewsapp.adapters.NewsAdapter getNewsAdapter() {
        return null;
    }
    
    public final void setNewsAdapter(@org.jetbrains.annotations.NotNull()
    com.example.mvvmnewsapp.adapters.NewsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void hideProgressBar() {
    }
    
    private final void showProgressBar() {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    public final boolean isLastPage() {
        return false;
    }
    
    public final void setLastPage(boolean p0) {
    }
    
    public final boolean isScrolling() {
        return false;
    }
    
    public final void setScrolling(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.OnScrollListener getScrollListner() {
        return null;
    }
    
    private final void setupRecyclerView() {
    }
    
    public final void onTextChanged(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$onTextChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> onTextChanged) {
    }
}