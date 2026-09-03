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
import androidx.activity.OooOo00;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
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
import p371o0OOo0oO.oo000o;
import p405o0Oo0OOO.o0OO;
import p497o0o00OoO.o0000oo;
import p557o0oOOooO.oOo0000O;
import p557o0oOOooO.oOo00ooO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p598o0oo00Oo.o0000O00;
import p604o0oo0O0.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/SendMomentEmojiAtPollView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lo0Oo0OOO/o0OO;", "OooO0Oo", "Lo0Oo0OOO/o0OO;", "getBinding", "()Lo0Oo0OOO/o0OO;", "binding", "Lkotlin/Function0;", "", "OooO0o0", "Lkotlin/jvm/functions/Function0;", "getAddImageListener", "()Lkotlin/jvm/functions/Function0;", "setAddImageListener", "(Lkotlin/jvm/functions/Function0;)V", "addImageListener", "OooO0o", "getAddVideoListener", "setAddVideoListener", "addVideoListener", "OooO0oO", "getAtListener", "setAtListener", "atListener", "OooO0oo", "getPollListener", "setPollListener", "pollListener", "Lo0o00OoO/o0000oo;", "OooOOO0", "Lkotlin/Lazy;", "getPanelLayoutState", "()Lo0o00OoO/o0000oo;", "panelLayoutState", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class SendMomentEmojiAtPollView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f30640OooOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Activity f30641OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o0OO binding;

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
    public int f30647OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public EditTextSpan f30648OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<oo000o> f30649OooOO0o;

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
            o0oo0000.OooO00o.OooO0O0("103071");
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
            o0oo0000.OooO00o.OooO0O0("103072");
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
            o0oo0000.OooO00o.OooO0O0("103073");
            SendMomentEmojiAtPollView sendMomentEmojiAtPollView = SendMomentEmojiAtPollView.this;
            oo000o value = sendMomentEmojiAtPollView.f30649OooOO0o.getValue();
            if (value != null) {
                Activity activity = sendMomentEmojiAtPollView.f30641OooO;
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
            o0oo0000.OooO00o.OooO0O0("103069");
            SendMomentEmojiAtPollView sendMomentEmojiAtPollView = SendMomentEmojiAtPollView.this;
            Function0<Unit> atListener = sendMomentEmojiAtPollView.getAtListener();
            if (atListener != null) {
                atListener.invoke();
            }
            sendMomentEmojiAtPollView.OooO0oO(false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<o0000oo> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000oo invoke() {
            Activity activity = SendMomentEmojiAtPollView.this.f30641OooO;
            if (activity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                activity = null;
            }
            return new o0000oo(activity);
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Integer, Intent, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f30658OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(boolean z) {
            super(2);
            this.f30658OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, Intent intent) {
            Intent intent2 = intent;
            if (intent2 != null) {
                o0oo0000.OooO00o.OooO0O0("103070");
                FriendInfo friendInfo = (FriendInfo) intent2.getSerializableExtra("Data");
                int i = SendMomentEmojiAtPollView.f30640OooOOO;
                SendMomentEmojiAtPollView sendMomentEmojiAtPollView = SendMomentEmojiAtPollView.this;
                sendMomentEmojiAtPollView.getClass();
                EditTextSpan editTextSpan = null;
                if (friendInfo != null) {
                    if (this.f30658OooO0o0) {
                        try {
                            EditTextSpan editTextSpan2 = sendMomentEmojiAtPollView.f30648OooOO0O;
                            if (editTextSpan2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                                editTextSpan2 = null;
                            }
                            Editable text = editTextSpan2.getText();
                            EditTextSpan editTextSpan3 = sendMomentEmojiAtPollView.f30648OooOO0O;
                            if (editTextSpan3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                                editTextSpan3 = null;
                            }
                            int selectionStart = editTextSpan3.getSelectionStart() - 1;
                            EditTextSpan editTextSpan4 = sendMomentEmojiAtPollView.f30648OooOO0O;
                            if (editTextSpan4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                                editTextSpan4 = null;
                            }
                            text.delete(selectionStart, editTextSpan4.getSelectionStart());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    o0000O00.OooO("onEventMainThread SendPost before friendInfo = " + friendInfo);
                    UserInfo userInfo = friendInfo.getUserInfo();
                    long userId = userInfo != null ? userInfo.getUserId() : 0L;
                    if (friendInfo.getUserInfo() != null && userId >= 1) {
                        UserInfo userInfo2 = friendInfo.getUserInfo();
                        oOo00ooO ooo00ooo = new oOo00ooO(userInfo2 != null ? userInfo2.getUserName() : null, userId);
                        o0000O00.OooO0O0("onEventMainThread SendPost later editTextSpanItemAt = " + ooo00ooo);
                        EditTextSpan editTextSpan5 = sendMomentEmojiAtPollView.f30648OooOO0O;
                        if (editTextSpan5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("editContent");
                            editTextSpan5 = null;
                        }
                        editTextSpan5.OooO00o("@", ooo00ooo);
                    }
                }
                EditTextSpan editTextSpan6 = sendMomentEmojiAtPollView.f30648OooOO0O;
                if (editTextSpan6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editContent");
                } else {
                    editTextSpan = editTextSpan6;
                }
                editTextSpan.postDelayed(new androidx.core.widget.OooO0o(sendMomentEmojiAtPollView, 3), 200L);
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
    public final o0000oo getPanelLayoutState() {
        return (o0000oo) this.panelLayoutState.getValue();
    }

    public final void OooO0OO(boolean z) {
        o0OO o0oo = this.binding;
        o0oo.f44553OooO0O0.setClickable(z);
        o0oo.f44553OooO0O0.setImageResource(z ? o0Oo0oo.ic_moment_add_image : o0Oo0oo.ic_moment_add_image_gray);
    }

    public final void OooO0Oo(boolean z) {
        o0OO o0oo = this.binding;
        o0oo.f44554OooO0OO.setClickable(z);
        o0oo.f44554OooO0OO.setImageResource(z ? o0Oo0oo.ic_moment_add_video : o0Oo0oo.ic_moment_add_video_gray);
    }

    public final void OooO0o(boolean z) {
        o0OO o0oo = this.binding;
        o0oo.f44556OooO0o.setClickable(z);
        o0oo.f44556OooO0o.setImageResource(z ? o0Oo0oo.ic_moment_add_poll : o0Oo0oo.ic_moment_add_poll_gray);
    }

    public final void OooO0o0() {
        oo000o value;
        MutableState<oo000o> mutableState = this.f30649OooOO0o;
        if (mutableState.getValue() == null || (value = mutableState.getValue()) == null) {
            return;
        }
        value.OooO00o();
    }

    public final void OooO0oO(boolean z) {
        EditTextSpan editTextSpan = this.f30648OooOO0O;
        if (editTextSpan == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editContent");
            editTextSpan = null;
        }
        oOo0000O spanManager = editTextSpan.getSpanManager();
        if ((spanManager != null ? spanManager.OooO0OO("@") : 0) < this.f30647OooOO0) {
            oo000o value = this.f30649OooOO0o.getValue();
            if (value != null) {
                value.OooO00o();
            }
            int i = Oooo0.f57391OooO0OO;
            Oooo0 oooo0 = new Oooo0((FragmentActivity) getContext());
            oooo0.f57393OooO0O0 = AtFriendsActivity.class;
            oooo0.OooO00o(new OooOO0O(z));
            return;
        }
        String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.Mention_a_maximum_of_XXX_people), androidx.compose.foundation.layout.oo000o.OooO00o(this.f30647OooOO0));
        if (StringsKt.isBlank(strOooO00o)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO00o, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
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
    public final o0OO getBinding() {
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
        o0OO o0ooInflate = o0OO.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(o0ooInflate, "inflate(...)");
        this.binding = o0ooInflate;
        ImageView ivAddImage = o0ooInflate.f44553OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ivAddImage, "ivAddImage");
        o000O.OooO(ivAddImage, new OooO00o());
        ImageView ivAddVideo = o0ooInflate.f44554OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivAddVideo, "ivAddVideo");
        o000O.OooO(ivAddVideo, new OooO0O0());
        ImageView ivEmoji = o0ooInflate.f44557OooO0o0;
        Intrinsics.checkNotNullExpressionValue(ivEmoji, "ivEmoji");
        o000O.OooO(ivEmoji, new OooO0OO());
        ImageView ivAt = o0ooInflate.f44555OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ivAt, "ivAt");
        o000O.OooO(ivAt, new OooO0o());
        ImageView ivPoll = o0ooInflate.f44556OooO0o;
        Intrinsics.checkNotNullExpressionValue(ivPoll, "ivPoll");
        o000O.OooO(ivPoll, new OooO());
        this.f30647OooOO0 = 10;
        this.f30649OooOO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.panelLayoutState = LazyKt.lazy(new OooOO0());
    }
}
