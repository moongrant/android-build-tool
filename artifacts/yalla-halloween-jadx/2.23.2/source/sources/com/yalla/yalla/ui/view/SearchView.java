package com.yalla.yalla.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000O;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.view.SearchView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o00000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;
import p650o0ooo.h;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104B\u001b\b\u0016\u0012\u0006\u00102\u001a\u000201\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b3\u00107B#\b\u0016\u0012\u0006\u00102\u001a\u000201\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\u0006\u00108\u001a\u00020\u0002¢\u0006\u0004\b3\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0002R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R?\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R?\u0010'\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!RT\u00100\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006:"}, d2 = {"Lcom/yalla/yalla/ui/view/SearchView;", "Landroid/widget/FrameLayout;", "", "colorId", "", "setLineColor", "setEditLineColor", "", "getSearchText", "Landroid/widget/EditText;", "getEditSearch", "Landroid/widget/ImageView;", "getImageClear", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "setClearVisibility", "Lkotlin/Function0;", "OooOOo", "Lkotlin/jvm/functions/Function0;", "getClearListener", "()Lkotlin/jvm/functions/Function0;", "setClearListener", "(Lkotlin/jvm/functions/Function0;)V", "clearListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "hasFocus", "OooOOoo", "Lkotlin/jvm/functions/Function1;", "getEditFocusListener", "()Lkotlin/jvm/functions/Function1;", "setEditFocusListener", "(Lkotlin/jvm/functions/Function1;)V", "editFocusListener", "content", "OooOo00", "getSearchTextChangedListener", "setSearchTextChangedListener", "searchTextChangedListener", "Lkotlin/Function2;", "actionId", "OooOo0", "Lkotlin/jvm/functions/Function2;", "getSearchClickListener", "()Lkotlin/jvm/functions/Function2;", "setSearchClickListener", "(Lkotlin/jvm/functions/Function2;)V", "searchClickListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class SearchView extends FrameLayout {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f30100OooOo0o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f30101OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public EditText f30102OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public View f30103OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ImageView f30104OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public View f30105OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f30106OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f30107OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f30108OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f30109OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f30110OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f30111OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f30112OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f30113OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> clearListener;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f30115OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> editFocusListener;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function2<? super Integer, ? super String, Unit> searchClickListener;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super String, Unit> searchTextChangedListener;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public Job f30119OooOo0O;

    public static final class OooO00o implements TextWatcher {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.view.SearchView$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.view.SearchView$initView$2$onTextChanged$1", f = "SearchView.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0339OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f30121OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ CharSequence f30122OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ SearchView f30123OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0339OooO00o(SearchView searchView, CharSequence charSequence, Continuation<? super C0339OooO00o> continuation) {
                super(2, continuation);
                this.f30123OooO0o0 = searchView;
                this.f30122OooO0o = charSequence;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0339OooO00o(this.f30123OooO0o0, this.f30122OooO0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0339OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f30121OooO0Oo;
                SearchView searchView = this.f30123OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = searchView.f30106OooO0oo;
                    this.f30121OooO0Oo = 1;
                    if (DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CharSequence charSequence = this.f30122OooO0o;
                if (StringsKt.trim((CharSequence) charSequence.toString()).toString().length() == 0) {
                    searchView.setClearVisibility(8);
                } else {
                    searchView.setClearVisibility(0);
                }
                Function1<String, Unit> searchTextChangedListener = searchView.getSearchTextChangedListener();
                if (searchTextChangedListener != null) {
                    searchTextChangedListener.invoke(charSequence.toString());
                }
                return Unit.INSTANCE;
            }
        }

        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NotNull Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            SearchView searchView = SearchView.this;
            Job job = searchView.f30119OooOo0O;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            searchView.f30119OooOo0O = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C0339OooO00o(searchView, s, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30106OooO0oo = 300L;
        OooO00o(context, null);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        View.inflate(context, oo0o0Oo.view_search, this);
        View viewFindViewById = findViewById(o0OO00O.editSearch);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f30102OooO0Oo = (EditText) viewFindViewById;
        View viewFindViewById2 = findViewById(o0OO00O.ivClear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f30104OooO0o0 = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(o0OO00O.viewLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f30103OooO0o = viewFindViewById3;
        View viewFindViewById4 = findViewById(o0OO00O.editLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f30105OooO0oO = viewFindViewById4;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o00000.SearchView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f30101OooO = typedArrayObtainStyledAttributes.getInteger(o00000.SearchView_editSearchBackground, 0);
            this.f30107OooOO0 = typedArrayObtainStyledAttributes.getDimension(o00000.SearchView_editSearchMarginTop, 0.0f);
            this.f30108OooOO0O = typedArrayObtainStyledAttributes.getDimension(o00000.SearchView_editSearchMarginBottom, 0.0f);
            this.f30109OooOO0o = typedArrayObtainStyledAttributes.getDimension(o00000.SearchView_editSearchMarginStart, 0.0f);
            this.f30111OooOOO0 = typedArrayObtainStyledAttributes.getDimension(o00000.SearchView_editSearchMarginEnd, 0.0f);
            this.f30110OooOOO = typedArrayObtainStyledAttributes.getDimension(o00000.SearchView_editSearchPaddingTop, 0.0f);
            this.f30112OooOOOO = typedArrayObtainStyledAttributes.getDimension(o00000.SearchView_editSearchPaddingBottom, 0.0f);
            this.f30113OooOOOo = typedArrayObtainStyledAttributes.getDimension(o00000.SearchView_editSearchPaddingStart, 0.0f);
            this.f30115OooOOo0 = typedArrayObtainStyledAttributes.getDimension(o00000.SearchView_editSearchPaddingEnd, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        EditText editText = this.f30102OooO0Oo;
        ImageView imageView = null;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText = null;
        }
        editText.setBackgroundResource(this.f30101OooO);
        EditText editText2 = this.f30102OooO0Oo;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText2 = null;
        }
        ViewGroup.LayoutParams layoutParams = editText2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) this.f30107OooOO0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) this.f30108OooOO0O;
        layoutParams2.setMarginStart((int) this.f30109OooOO0o);
        layoutParams2.setMarginEnd((int) this.f30111OooOOO0);
        EditText editText3 = this.f30102OooO0Oo;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText3 = null;
        }
        editText3.setLayoutParams(layoutParams2);
        EditText editText4 = this.f30102OooO0Oo;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText4 = null;
        }
        o000O.OooOO0o(editText4, (int) this.f30110OooOOO);
        EditText editText5 = this.f30102OooO0Oo;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText5 = null;
        }
        o000O.OooOO0(editText5, (int) this.f30112OooOOOO);
        EditText editText6 = this.f30102OooO0Oo;
        if (editText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText6 = null;
        }
        o000O.OooOO0O(editText6, (int) this.f30113OooOOOo);
        EditText editText7 = this.f30102OooO0Oo;
        if (editText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText7 = null;
        }
        int i = (int) this.f30115OooOOo0;
        Intrinsics.checkNotNullParameter(editText7, "<this>");
        editText7.setPaddingRelative(editText7.getPaddingStart(), editText7.getPaddingTop(), i, editText7.getPaddingBottom());
        EditText editText8 = this.f30102OooO0Oo;
        if (editText8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText8 = null;
        }
        editText8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0oOooOO.r1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Function1<? super Boolean, Unit> function1;
                int i2 = SearchView.f30100OooOo0o;
                SearchView this$0 = this.f56965OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!z || (function1 = this$0.editFocusListener) == null) {
                    return;
                }
                function1.invoke(Boolean.valueOf(z));
            }
        });
        EditText editText9 = this.f30102OooO0Oo;
        if (editText9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText9 = null;
        }
        editText9.addTextChangedListener(new OooO00o());
        EditText editText10 = this.f30102OooO0Oo;
        if (editText10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText10 = null;
        }
        editText10.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0oOooOO.s1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                int i3 = SearchView.f30100OooOo0o;
                SearchView this$0 = this.f56973OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function2<? super Integer, ? super String, Unit> function2 = this$0.searchClickListener;
                if (function2 == null) {
                    return true;
                }
                Integer numValueOf = Integer.valueOf(i2);
                EditText editText11 = this$0.f30102OooO0Oo;
                if (editText11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editSearch");
                    editText11 = null;
                }
                function2.invoke(numValueOf, StringsKt.trim((CharSequence) editText11.getText().toString()).toString());
                return true;
            }
        });
        ImageView imageView2 = this.f30104OooO0o0;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClear");
        } else {
            imageView = imageView2;
        }
        imageView.setOnClickListener(new h(this, 1));
    }

    @Nullable
    public final Function0<Unit> getClearListener() {
        return this.clearListener;
    }

    @Nullable
    public final Function1<Boolean, Unit> getEditFocusListener() {
        return this.editFocusListener;
    }

    @NotNull
    public final EditText getEditSearch() {
        EditText editText = this.f30102OooO0Oo;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editSearch");
        return null;
    }

    @NotNull
    public final ImageView getImageClear() {
        ImageView imageView = this.f30104OooO0o0;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ivClear");
        return null;
    }

    @Nullable
    public final Function2<Integer, String, Unit> getSearchClickListener() {
        return this.searchClickListener;
    }

    @NotNull
    public final String getSearchText() {
        EditText editText = this.f30102OooO0Oo;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText = null;
        }
        return editText.getText().toString();
    }

    @Nullable
    public final Function1<String, Unit> getSearchTextChangedListener() {
        return this.searchTextChangedListener;
    }

    public final void setClearListener(@Nullable Function0<Unit> function0) {
        this.clearListener = function0;
    }

    public final void setClearVisibility(int visibility) {
        ImageView imageView = this.f30104OooO0o0;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClear");
            imageView = null;
        }
        imageView.setVisibility(visibility);
    }

    public final void setEditFocusListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.editFocusListener = function1;
    }

    public final void setEditLineColor(@ColorInt int colorId) {
        View view = this.f30105OooO0oO;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLine");
            view = null;
        }
        view.setBackgroundColor(colorId);
    }

    public final void setLineColor(@ColorInt int colorId) {
        View view = this.f30103OooO0o;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLine");
            view = null;
        }
        view.setBackgroundColor(colorId);
    }

    public final void setSearchClickListener(@Nullable Function2<? super Integer, ? super String, Unit> function2) {
        this.searchClickListener = function2;
    }

    public final void setSearchTextChangedListener(@Nullable Function1<? super String, Unit> function1) {
        this.searchTextChangedListener = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30106OooO0oo = 300L;
        OooO00o(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30106OooO0oo = 300L;
        OooO00o(context, attributeSet);
    }
}
