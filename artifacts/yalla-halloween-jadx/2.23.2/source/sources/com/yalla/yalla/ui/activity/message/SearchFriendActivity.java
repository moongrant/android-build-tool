package com.yalla.yalla.ui.activity.message;

import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.api.old.ApiSearch$userSearch$$inlined$call$1;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.adapter.SearchFriendHotAdapter;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import io.agora.rtc.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p590o0oOooo0.oOO0OOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/SearchFriendActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class SearchFriendActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f25264OooOo = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public XRefreshLayout f25265OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public EditText f25266OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public LinearLayout f25267OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public SearchFriendHotAdapter f25268OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ImageView f25269OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o00O00o0 f25270OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f25271OooOo0o = 1;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.SearchFriendActivity$searchFriend$1", f = "SearchFriendActivity.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSearchFriendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFriendActivity.kt\ncom/yalla/yalla/ui/activity/message/SearchFriendActivity$searchFriend$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,174:1\n107#2:175\n79#2,22:176\n*S KotlinDebug\n*F\n+ 1 SearchFriendActivity.kt\ncom/yalla/yalla/ui/activity/message/SearchFriendActivity$searchFriend$1\n*L\n152#1:175\n152#1:176,22\n*E\n"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25272OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f25273OooO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25273OooO0o = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SearchFriendActivity.this.new OooO00o(this.f25273OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25272OooO0Oo;
            XRefreshLayout xRefreshLayout = null;
            SearchFriendActivity searchFriendActivity = SearchFriendActivity.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EditText editText = searchFriendActivity.f25266OooOOo0;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchEdit");
                    editText = null;
                }
                String string = editText.getText().toString();
                int length = string.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    boolean z3 = Intrinsics.compare((int) string.charAt(!z2 ? i2 : length), 32) <= 0;
                    if (z2) {
                        if (!z3) {
                            break;
                        }
                        length--;
                    } else if (z3) {
                        i2++;
                    } else {
                        z2 = true;
                    }
                }
                String string2 = string.subSequence(i2, length + 1).toString();
                int i3 = searchFriendActivity.f25271OooOo0o;
                this.f25272OooO0Oo = 1;
                String strOooO0oO = p380o0OOoOo.oo000o.OooO0oO(p384o0OOoo0O.Oooo0.f43424o0000oOo);
                p380o0OOoOo.o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0oO, "url", strOooO0oO, 0);
                o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(string2), "search");
                o0oooooOooO00o.OooO0O0(String.valueOf(i3), "pageindex");
                o0oooooOooO00o.OooO0O0("20", "pagesize");
                obj = com.code.android.util.OooOOO.OooO0Oo(new ApiSearch$userSearch$$inlined$call$1(o0oooooOooO00o, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            boolean zIsSuccess = apiResult.isSuccess();
            boolean z4 = this.f25273OooO0o;
            if (zIsSuccess) {
                if (z4) {
                    o00O00o0 o00o00o1 = searchFriendActivity.f25270OooOo0O;
                    if (o00o00o1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resultAdapter");
                        o00o00o1 = null;
                    }
                    o00o00o1.OooOoO0((List) apiResult.getData());
                } else {
                    o00O00o0 o00o00o2 = searchFriendActivity.f25270OooOo0O;
                    if (o00o00o2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resultAdapter");
                        o00o00o2 = null;
                    }
                    List listEmptyList = (List) apiResult.getData();
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    o00o00o2.OooO0O0(listEmptyList);
                }
                o00O00o0 o00o00o3 = searchFriendActivity.f25270OooOo0O;
                if (o00o00o3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resultAdapter");
                    o00o00o3 = null;
                }
                o00o00o3.Oooo00o();
                searchFriendActivity.f25271OooOo0o++;
                if (apiResult.getData() != null) {
                    Object data = apiResult.getData();
                    Intrinsics.checkNotNull(data);
                    z = ((List) data).size() == 0;
                }
                XRefreshLayout xRefreshLayout2 = searchFriendActivity.f25265OooOOo;
                if (xRefreshLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("xrlSearchFriend");
                } else {
                    xRefreshLayout = xRefreshLayout2;
                }
                xRefreshLayout.OooOooo(z4, true, z);
            } else {
                o00O00o0 o00o00o4 = searchFriendActivity.f25270OooOo0O;
                if (o00o00o4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resultAdapter");
                    o00o00o4 = null;
                }
                o00o00o4.OooOoo();
                XRefreshLayout xRefreshLayout3 = searchFriendActivity.f25265OooOOo;
                if (xRefreshLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("xrlSearchFriend");
                } else {
                    xRefreshLayout = xRefreshLayout3;
                }
                xRefreshLayout.OooOooo(z4, false, true);
            }
            return Unit.INSTANCE;
        }
    }

    public final void OooOo0(boolean z) {
        if (z) {
            this.f25271OooOo0o = 1;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO00o(z, null), 3, null);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_searchfriend);
        OooOOoo(p562o0oOo000.o000000.Search_add_new_friends);
        RecyclerView recyclerView = (RecyclerView) findViewById(p562o0oOo000.o0OO00O.rec_search);
        View viewFindViewById = findViewById(p562o0oOo000.o0OO00O.searchEdit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f25266OooOOo0 = (EditText) viewFindViewById;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(p562o0oOo000.o0OO00O.rec_search_friend_result);
        View viewFindViewById2 = findViewById(p562o0oOo000.o0OO00O.ll_search_friend_hot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f25267OooOOoo = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(p562o0oOo000.o0OO00O.xrlSearch_friend);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f25265OooOOo = (XRefreshLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(p562o0oOo000.o0OO00O.iv_clear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f25269OooOo00 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClear");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.message.o00O00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SearchFriendActivity.f25264OooOo;
                SearchFriendActivity this$0 = this.f25379OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText = this$0.f25266OooOOo0;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchEdit");
                    editText = null;
                }
                editText.setText("");
            }
        });
        XRefreshLayout xRefreshLayout = this.f25265OooOOo;
        if (xRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xrlSearchFriend");
            xRefreshLayout = null;
        }
        xRefreshLayout.setOnLoadMoreListener(new androidx.media3.session.o0000(this));
        recyclerView.setLayoutManager(new FixGridLayoutManager(this, 3));
        SearchFriendHotAdapter searchFriendHotAdapter = new SearchFriendHotAdapter(this);
        this.f25268OooOo0 = searchFriendHotAdapter;
        searchFriendHotAdapter.f26989OooO0Oo = new o00O00OO(this);
        SearchFriendHotAdapter searchFriendHotAdapter2 = this.f25268OooOo0;
        if (searchFriendHotAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterHot");
            searchFriendHotAdapter2 = null;
        }
        recyclerView.setAdapter(searchFriendHotAdapter2);
        o00O00o0 o00o00o1 = new o00O00o0(this, p562o0oOo000.oo0o0Oo.item_searchfriend_result);
        this.f25270OooOo0O = o00o00o1;
        o00o00o1.f13176OooO0o = new androidx.media3.session.o0OoOo0(this);
        o00o00o1.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_search);
        o00O00o0 o00o00o2 = this.f25270OooOo0O;
        if (o00o00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultAdapter");
            o00o00o2 = null;
        }
        o00o00o2.Oooo000(p562o0oOo000.o000000.No_search_results);
        o00O00o0 o00o00o3 = this.f25270OooOo0O;
        if (o00o00o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultAdapter");
            o00o00o3 = null;
        }
        o00o00o3.Oooo00O(false);
        o00O00o0 o00o00o4 = this.f25270OooOo0O;
        if (o00o00o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultAdapter");
            o00o00o4 = null;
        }
        o00o00o4.Oooo0OO(new oo00o(this));
        recyclerView2.setLayoutManager(new FixLinearLayoutManager(this));
        o00O00o0 o00o00o5 = this.f25270OooOo0O;
        if (o00o00o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultAdapter");
            o00o00o5 = null;
        }
        recyclerView2.setAdapter(o00o00o5);
        recyclerView2.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.activity.message.o00O00O
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = SearchFriendActivity.f25264OooOo;
                SearchFriendActivity this$0 = this.f25426OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText = this$0.f25266OooOOo0;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchEdit");
                    editText = null;
                }
                InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
                kotlin.collections.OooO00o.OooO0O0(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
                return false;
            }
        });
        recyclerView2.setOnScrollListener(new o00O0());
        p601o0oo00oO.o000OO o000ooOooO0O0 = p601o0oo00oO.o000OO.OooO0O0();
        EditText editText = this.f25266OooOOo0;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchEdit");
            editText = null;
        }
        o000ooOooO0O0.OooO0OO(editText, new p022Oooo00O.o00oOoo(this));
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43386OooooO0, p426o0OoO0o0.OooOOOO.OooO00o(), new oOO00O(this));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        p601o0oo00oO.o000OO.OooO0O0().OooO00o();
    }
}
