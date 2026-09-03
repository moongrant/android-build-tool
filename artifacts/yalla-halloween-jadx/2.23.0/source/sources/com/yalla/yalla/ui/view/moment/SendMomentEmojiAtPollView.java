package com.yalla.yalla.ui.view.moment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.message.AtFriendsActivity;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p367o0OOo0o0.OooOOOO;
import p426o0OoOO.o0OOO0o;
import p490o0o00OOO.OooOo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p585o0oOooOO.h;
import p585o0oOooOO.k;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;
import p599o0oo00oo.o0000OO0;
import p641o0ooOOOO.b3;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/SendMomentEmojiAtPollView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lo0ooOOOO/b3;", "OooO0Oo", "Lo0ooOOOO/b3;", "getBinding", "()Lo0ooOOOO/b3;", "binding", "Lkotlin/Function0;", "", "OooO0o0", "Lkotlin/jvm/functions/Function0;", "getAddImageListener", "()Lkotlin/jvm/functions/Function0;", "setAddImageListener", "(Lkotlin/jvm/functions/Function0;)V", "addImageListener", "OooO0o", "getAddVideoListener", "setAddVideoListener", "addVideoListener", "OooO0oO", "getAtListener", "setAtListener", "atListener", "OooO0oo", "getPollListener", "setPollListener", "pollListener", "Lo0o00OOO/OooOo;", "OooOOO0", "Lkotlin/Lazy;", "getPanelLayoutState", "()Lo0o00OOO/OooOo;", "panelLayoutState", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class SendMomentEmojiAtPollView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f31181OooOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Activity f31182OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b3 binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> addVideoListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> addImageListener;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> atListener;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> pollListener;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f31188OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public EditTextSpan f31189OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<OooOOOO> f31190OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy panelLayoutState;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> pollListener = SendMomentEmojiAtPollView.this.getPollListener();
            if (pollListener != null) {
                pollListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0OO000.OooO00o("103071");
            Function0<Unit> addImageListener = SendMomentEmojiAtPollView.this.getAddImageListener();
            if (addImageListener != null) {
                addImageListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0OO000.OooO00o("103072");
            Function0<Unit> addVideoListener = SendMomentEmojiAtPollView.this.getAddVideoListener();
            if (addVideoListener != null) {
                addVideoListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0OO000.OooO00o("103073");
            SendMomentEmojiAtPollView sendMomentEmojiAtPollView = SendMomentEmojiAtPollView.this;
            OooOOOO value = sendMomentEmojiAtPollView.f31190OooOO0o.getValue();
            if (value != null) {
                Activity activity = sendMomentEmojiAtPollView.f31182OooO;
                if (activity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activity");
                    activity = null;
                }
                value.OooO0OO(activity);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<View, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0OO000.OooO00o("103069");
            SendMomentEmojiAtPollView sendMomentEmojiAtPollView = SendMomentEmojiAtPollView.this;
            Function0<Unit> atListener = sendMomentEmojiAtPollView.getAtListener();
            if (atListener != null) {
                atListener.invoke();
            }
            sendMomentEmojiAtPollView.OooO0oO(false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<OooOo> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOo invoke() {
            Activity activity = SendMomentEmojiAtPollView.this.f31182OooO;
            if (activity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                activity = null;
            }
            return new OooOo(activity);
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Integer, Intent, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f31199OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(boolean z) {
            super(2);
            this.f31199OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, Intent intent) {
            Intent intent2 = intent;
            if (intent2 != null) {
                o0OO000.OooO00o("103070");
                FriendInfo friendInfo = (FriendInfo) intent2.getSerializableExtra("Data");
                int i = SendMomentEmojiAtPollView.f31181OooOOO;
                SendMomentEmojiAtPollView sendMomentEmojiAtPollView = SendMomentEmojiAtPollView.this;
                sendMomentEmojiAtPollView.getClass();
                EditTextSpan editTextSpan = null;
                if (friendInfo != null) {
                    if (this.f31199OooO0o0) {
                        try {
                            EditTextSpan editTextSpan2 = sendMomentEmojiAtPollView.f31189OooOO0O;
                            if (editTextSpan2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                                editTextSpan2 = null;
                            }
                            Editable text = editTextSpan2.getText();
                            EditTextSpan editTextSpan3 = sendMomentEmojiAtPollView.f31189OooOO0O;
                            if (editTextSpan3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                                editTextSpan3 = null;
                            }
                            int selectionStart = editTextSpan3.getSelectionStart() - 1;
                            EditTextSpan editTextSpan4 = sendMomentEmojiAtPollView.f31189OooOO0O;
                            if (editTextSpan4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                                editTextSpan4 = null;
                            }
                            text.delete(selectionStart, editTextSpan4.getSelectionStart());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    OooOOO0.OooO("onEventMainThread SendPost before friendInfo = " + friendInfo);
                    UserInfo userInfo = friendInfo.getUserInfo();
                    long userId = userInfo != null ? userInfo.getUserId() : 0L;
                    if (friendInfo.getUserInfo() != null && userId >= 1) {
                        UserInfo userInfo2 = friendInfo.getUserInfo();
                        h hVar = new h(userInfo2 != null ? userInfo2.getUserName() : null, userId);
                        OooOOO0.OooO0O0("onEventMainThread SendPost later editTextSpanItemAt = " + hVar);
                        EditTextSpan editTextSpan5 = sendMomentEmojiAtPollView.f31189OooOO0O;
                        if (editTextSpan5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("editContent");
                            editTextSpan5 = null;
                        }
                        editTextSpan5.OooO00o("@", hVar);
                    }
                }
                EditTextSpan editTextSpan6 = sendMomentEmojiAtPollView.f31189OooOO0O;
                if (editTextSpan6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editContent");
                } else {
                    editTextSpan = editTextSpan6;
                }
                editTextSpan.postDelayed(new o000O0Oo.OooOO0(sendMomentEmojiAtPollView, 2), 200L);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentEmojiAtPollView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OooOo getPanelLayoutState() {
        return (OooOo) this.panelLayoutState.getValue();
    }

    public final void OooO0OO(boolean z) {
        b3 b3Var = this.binding;
        b3Var.f57542OooO0O0.setClickable(z);
        b3Var.f57542OooO0O0.setImageResource(z ? oOo00OO0.ic_moment_add_image : oOo00OO0.ic_moment_add_image_gray);
    }

    public final void OooO0Oo(boolean z) {
        b3 b3Var = this.binding;
        b3Var.f57543OooO0OO.setClickable(z);
        b3Var.f57543OooO0OO.setImageResource(z ? oOo00OO0.ic_moment_add_video : oOo00OO0.ic_moment_add_video_gray);
    }

    public final void OooO0o(boolean z) {
        b3 b3Var = this.binding;
        b3Var.f57545OooO0o.setClickable(z);
        b3Var.f57545OooO0o.setImageResource(z ? oOo00OO0.ic_moment_add_poll : oOo00OO0.ic_moment_add_poll_gray);
    }

    public final void OooO0o0() {
        OooOOOO value;
        MutableState<OooOOOO> mutableState = this.f31190OooOO0o;
        if (mutableState.getValue() == null || (value = mutableState.getValue()) == null) {
            return;
        }
        value.OooO00o();
    }

    public final void OooO0oO(boolean z) {
        EditTextSpan editTextSpan = this.f31189OooOO0O;
        if (editTextSpan == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editContent");
            editTextSpan = null;
        }
        k spanManager = editTextSpan.getSpanManager();
        if ((spanManager != null ? spanManager.OooO0OO("@") : 0) < this.f31188OooOO0) {
            OooOOOO value = this.f31190OooOO0o.getValue();
            if (value != null) {
                value.OooO00o();
            }
            int i = o0000OO0.f56860OooO0OO;
            o0000OO0 o0000oo1 = new o0000OO0((FragmentActivity) getContext());
            o0000oo1.f56862OooO0O0 = AtFriendsActivity.class;
            o0000oo1.OooO00o(new OooOO0O(z));
            return;
        }
        String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Mention_a_maximum_of_XXX_people), o0OOO0o.OooO00o(this.f31188OooOO0));
        if (StringsKt.isBlank(strOooO00o)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO00o, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        }
    }

    @Nullable
    public final Function0<Unit> getAddImageListener() {
        return this.addImageListener;
    }

    @Nullable
    public final Function0<Unit> getAddVideoListener() {
        return this.addVideoListener;
    }

    @Nullable
    public final Function0<Unit> getAtListener() {
        return this.atListener;
    }

    @NotNull
    public final b3 getBinding() {
        return this.binding;
    }

    @Nullable
    public final Function0<Unit> getPollListener() {
        return this.pollListener;
    }

    public final void setAddImageListener(@Nullable Function0<Unit> function0) {
        this.addImageListener = function0;
    }

    public final void setAddVideoListener(@Nullable Function0<Unit> function0) {
        this.addVideoListener = function0;
    }

    public final void setAtListener(@Nullable Function0<Unit> function0) {
        this.atListener = function0;
    }

    public final void setPollListener(@Nullable Function0<Unit> function0) {
        this.pollListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentEmojiAtPollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SendMomentEmojiAtPollView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentEmojiAtPollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        b3 b3VarInflate = b3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(b3VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = b3VarInflate;
        ImageView imageView = b3VarInflate.f57542OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivAddImage");
        o000OO00.OooO(imageView, new OooO00o());
        ImageView imageView2 = b3VarInflate.f57543OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivAddVideo");
        o000OO00.OooO(imageView2, new OooO0O0());
        ImageView imageView3 = b3VarInflate.f57546OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivEmoji");
        o000OO00.OooO(imageView3, new OooO0OO());
        ImageView imageView4 = b3VarInflate.f57544OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivAt");
        o000OO00.OooO(imageView4, new OooO0o());
        ImageView imageView5 = b3VarInflate.f57545OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivPoll");
        o000OO00.OooO(imageView5, new OooO());
        this.f31188OooOO0 = 10;
        this.f31190OooOO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.panelLayoutState = LazyKt.lazy(new OooOO0());
    }
}
