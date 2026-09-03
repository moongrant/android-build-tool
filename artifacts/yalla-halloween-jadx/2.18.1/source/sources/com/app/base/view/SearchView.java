package com.app.base.view;

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
import com.app.base.view.SearchView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
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
import p175o00OooOo.o0OO0o00;
import p444o0OoOo0O.o0O0OO0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104B\u001b\b\u0016\u0012\u0006\u00102\u001a\u000201\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b3\u00107B#\b\u0016\u0012\u0006\u00102\u001a\u000201\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\u0006\u00108\u001a\u00020\u0002¢\u0006\u0004\b3\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0002R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R?\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R?\u0010'\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!RT\u00100\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006:"}, d2 = {"Lcom/app/base/view/SearchView;", "Landroid/widget/FrameLayout;", "", "colorId", "", "setLineColor", "setEditLineColor", "", "getSearchText", "Landroid/widget/EditText;", "getEditSearch", "Landroid/widget/ImageView;", "getImageClear", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "setClearVisibility", "Lkotlin/Function0;", "OoooOoo", "Lkotlin/jvm/functions/Function0;", "getClearListener", "()Lkotlin/jvm/functions/Function0;", "setClearListener", "(Lkotlin/jvm/functions/Function0;)V", "clearListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "hasFocus", "Ooooo00", "Lkotlin/jvm/functions/Function1;", "getEditFocusListener", "()Lkotlin/jvm/functions/Function1;", "setEditFocusListener", "(Lkotlin/jvm/functions/Function1;)V", "editFocusListener", "content", "Ooooo0o", "getSearchTextChangedListener", "setSearchTextChangedListener", "searchTextChangedListener", "Lkotlin/Function2;", "actionId", "OooooO0", "Lkotlin/jvm/functions/Function2;", "getSearchClickListener", "()Lkotlin/jvm/functions/Function2;", "setSearchClickListener", "(Lkotlin/jvm/functions/Function2;)V", "searchClickListener", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SearchView extends FrameLayout {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final /* synthetic */ int f12074OooooOo = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public View f12075Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public EditText f12076Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ImageView f12077Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f12078Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f12079OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f12080OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final long f12081OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f12082OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f12083OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f12084OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f12085OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f12086OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f12087OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> clearListener;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> editFocusListener;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super String, Unit> searchTextChangedListener;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function2<? super Integer, ? super String, Unit> searchClickListener;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public Job f12092OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f12093o000oOoO;

    public static final class OooO00o implements TextWatcher {

        /* JADX INFO: renamed from: com.app.base.view.SearchView$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.app.base.view.SearchView$initView$2$onTextChanged$1", f = "SearchView.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0077OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f12095Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ SearchView f12096Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ CharSequence f12097Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0077OooO00o(SearchView searchView, CharSequence charSequence, Continuation<? super C0077OooO00o> continuation) {
                super(2, continuation);
                this.f12096Oooo0oO = searchView;
                this.f12097Oooo0oo = charSequence;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0077OooO00o(this.f12096Oooo0oO, this.f12097Oooo0oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0077OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f12095Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.f12096Oooo0oO.f12081OoooO00;
                    this.f12095Oooo0o = 1;
                    if (DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (StringsKt.trim((CharSequence) this.f12097Oooo0oo.toString()).toString().length() == 0) {
                    this.f12096Oooo0oO.setClearVisibility(8);
                } else {
                    this.f12096Oooo0oO.setClearVisibility(0);
                }
                Function1<String, Unit> searchTextChangedListener = this.f12096Oooo0oO.getSearchTextChangedListener();
                if (searchTextChangedListener != null) {
                    searchTextChangedListener.invoke(this.f12097Oooo0oo.toString());
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
            Job job = SearchView.this.f12092OooooOO;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            SearchView.this.f12092OooooOO = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C0077OooO00o(SearchView.this, s, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12081OoooO00 = 300L;
        OooO00o(context, null);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        View.inflate(context, R.layout.view_search, this);
        View viewFindViewById = findViewById(R.id.editSearch);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.editSearch)");
        this.f12076Oooo0o = (EditText) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.ivClear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.ivClear)");
        this.f12077Oooo0oO = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.viewLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.viewLine)");
        this.f12078Oooo0oo = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.editLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.editLine)");
        this.f12075Oooo = viewFindViewById4;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o0O0OO0.SearchView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.SearchView)");
            this.f12080OoooO0 = typedArrayObtainStyledAttributes.getInteger(7, 0);
            this.f12082OoooO0O = typedArrayObtainStyledAttributes.getDimension(11, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f12079OoooO = typedArrayObtainStyledAttributes.getDimension(8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f12083OoooOO0 = typedArrayObtainStyledAttributes.getDimension(10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f12093o000oOoO = typedArrayObtainStyledAttributes.getDimension(9, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f12084OoooOOO = typedArrayObtainStyledAttributes.getDimension(15, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f12085OoooOOo = typedArrayObtainStyledAttributes.getDimension(12, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f12086OoooOo0 = typedArrayObtainStyledAttributes.getDimension(14, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f12087OoooOoO = typedArrayObtainStyledAttributes.getDimension(13, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            typedArrayObtainStyledAttributes.recycle();
        }
        EditText editText = this.f12076Oooo0o;
        ImageView imageView = null;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText = null;
        }
        editText.setBackgroundResource(this.f12080OoooO0);
        EditText editText2 = this.f12076Oooo0o;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText2 = null;
        }
        ViewGroup.LayoutParams layoutParams = editText2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) this.f12082OoooO0O;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) this.f12079OoooO;
        layoutParams2.setMarginStart((int) this.f12083OoooOO0);
        layoutParams2.setMarginEnd((int) this.f12093o000oOoO);
        EditText editText3 = this.f12076Oooo0o;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText3 = null;
        }
        editText3.setLayoutParams(layoutParams2);
        EditText editText4 = this.f12076Oooo0o;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText4 = null;
        }
        o00O0O.OooO0o(editText4, (int) this.f12084OoooOOO);
        EditText editText5 = this.f12076Oooo0o;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText5 = null;
        }
        int i = (int) this.f12085OoooOOo;
        Intrinsics.checkNotNullParameter(editText5, "<this>");
        editText5.setPaddingRelative(editText5.getPaddingStart(), editText5.getPaddingTop(), editText5.getPaddingEnd(), i);
        EditText editText6 = this.f12076Oooo0o;
        if (editText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText6 = null;
        }
        o00O0O.OooO0o0(editText6, (int) this.f12086OoooOo0);
        EditText editText7 = this.f12076Oooo0o;
        if (editText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText7 = null;
        }
        int i2 = (int) this.f12087OoooOoO;
        Intrinsics.checkNotNullParameter(editText7, "<this>");
        editText7.setPaddingRelative(editText7.getPaddingStart(), editText7.getPaddingTop(), i2, editText7.getPaddingBottom());
        EditText editText8 = this.f12076Oooo0o;
        if (editText8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText8 = null;
        }
        editText8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o00OooOo.o0OO0o
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Function1<? super Boolean, Unit> function1;
                SearchView this$0 = this.f32744Oooo0o;
                int i3 = SearchView.f12074OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!z || (function1 = this$0.editFocusListener) == null) {
                    return;
                }
                function1.invoke(Boolean.valueOf(z));
            }
        });
        EditText editText9 = this.f12076Oooo0o;
        if (editText9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText9 = null;
        }
        editText9.addTextChangedListener(new OooO00o());
        EditText editText10 = this.f12076Oooo0o;
        if (editText10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText10 = null;
        }
        editText10.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o00OooOo.o0OO0oO0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                SearchView this$0 = this.f32747OooO00o;
                int i4 = SearchView.f12074OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function2<? super Integer, ? super String, Unit> function2 = this$0.searchClickListener;
                if (function2 == null) {
                    return true;
                }
                Integer numValueOf = Integer.valueOf(i3);
                EditText editText11 = this$0.f12076Oooo0o;
                if (editText11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editSearch");
                    editText11 = null;
                }
                function2.invoke(numValueOf, StringsKt.trim((CharSequence) editText11.getText().toString()).toString());
                return true;
            }
        });
        ImageView imageView2 = this.f12077Oooo0oO;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClear");
        } else {
            imageView = imageView2;
        }
        imageView.setOnClickListener(new o0OO0o00(this, 0));
    }

    public final void OooO0O0() {
        View view = this.f12078Oooo0oo;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLine");
            view = null;
        }
        view.setVisibility(0);
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
        EditText editText = this.f12076Oooo0o;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("editSearch");
        return null;
    }

    @NotNull
    public final ImageView getImageClear() {
        ImageView imageView = this.f12077Oooo0oO;
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
        EditText editText = this.f12076Oooo0o;
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
        ImageView imageView = this.f12077Oooo0oO;
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
        View view = this.f12075Oooo;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editLine");
            view = null;
        }
        view.setBackgroundColor(colorId);
    }

    public final void setLineColor(@ColorInt int colorId) {
        View view = this.f12078Oooo0oo;
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
        this.f12081OoooO00 = 300L;
        OooO00o(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12081OoooO00 = 300L;
        OooO00o(context, attributeSet);
    }
}
