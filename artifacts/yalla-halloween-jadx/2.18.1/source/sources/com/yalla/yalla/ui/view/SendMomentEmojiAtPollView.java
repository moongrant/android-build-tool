package com.yalla.yalla.ui.view;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.code.android.util.ToastUtil;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.message.AtFriendsActivity;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p150o00Oo0Oo.OooOo;
import p150o00Oo0Oo.o000oOoO;
import p254o00ooO0O.o000O0O0;
import p470o0Oooo0.o00O0000;
import p515o0o0O00.o00O00;
import p558o0oOOoo.o0O00000;
import p620o0oo0o0O.oo00o;
import p649o0ooOOoo.u9;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/view/SendMomentEmojiAtPollView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function0;", "", "Oooo0oO", "Lkotlin/jvm/functions/Function0;", "getAtListener", "()Lkotlin/jvm/functions/Function0;", "setAtListener", "(Lkotlin/jvm/functions/Function0;)V", "atListener", "Oooo0oo", "getPollListener", "setPollListener", "pollListener", "Lo0ooOOoo/u9;", "binding", "Lo0ooOOoo/u9;", "getBinding", "()Lo0ooOOoo/u9;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SendMomentEmojiAtPollView extends ConstraintLayout {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f25157OoooO0O = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f25158Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final u9 f25159Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> atListener;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> pollListener;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public o00O0000 f25162OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public EditTextSpan f25163OoooO00;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Function0<Unit> pollListener;
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view, SendMomentEmojiAtPollView.this.getF25159Oooo0o().f50690OooO0O0)) {
                Function0<Unit> atListener = SendMomentEmojiAtPollView.this.getAtListener();
                if (atListener != null) {
                    atListener.invoke();
                }
                SendMomentEmojiAtPollView.this.OooO0o0(false);
                return;
            }
            if (!Intrinsics.areEqual(view, SendMomentEmojiAtPollView.this.getF25159Oooo0o().f50692OooO0Oo) || (pollListener = SendMomentEmojiAtPollView.this.getPollListener()) == null) {
                return;
            }
            pollListener.invoke();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Integer, Intent, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f25166Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(2);
            this.f25166Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, Intent intent) {
            Intent intent2 = intent;
            if (intent2 != null) {
                FriendInfo friendInfo = (FriendInfo) intent2.getSerializableExtra("Data");
                SendMomentEmojiAtPollView sendMomentEmojiAtPollView = SendMomentEmojiAtPollView.this;
                boolean z = this.f25166Oooo0oO;
                int i = SendMomentEmojiAtPollView.f25157OoooO0O;
                Objects.requireNonNull(sendMomentEmojiAtPollView);
                EditTextSpan editTextSpan = null;
                if (friendInfo != null) {
                    if (z) {
                        try {
                            EditTextSpan editTextSpan2 = sendMomentEmojiAtPollView.f25163OoooO00;
                            if (editTextSpan2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                                editTextSpan2 = null;
                            }
                            Editable text = editTextSpan2.getText();
                            EditTextSpan editTextSpan3 = sendMomentEmojiAtPollView.f25163OoooO00;
                            if (editTextSpan3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                                editTextSpan3 = null;
                            }
                            int selectionStart = editTextSpan3.getSelectionStart() - 1;
                            EditTextSpan editTextSpan4 = sendMomentEmojiAtPollView.f25163OoooO00;
                            if (editTextSpan4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                                editTextSpan4 = null;
                            }
                            text.delete(selectionStart, editTextSpan4.getSelectionStart());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    o00O00.OooOO0O("onEventMainThread SendPost before friendInfo = " + friendInfo);
                    UserInfo userInfo = friendInfo.getUserInfo();
                    long userId = userInfo != null ? userInfo.getUserId() : 0L;
                    if (friendInfo.getUserInfo() != null && userId >= 1) {
                        UserInfo userInfo2 = friendInfo.getUserInfo();
                        OooOo oooOo = new OooOo(userInfo2 != null ? userInfo2.getUserName() : null, userId);
                        o00O00.OooO0O0("onEventMainThread SendPost later editTextSpanItemAt = " + oooOo);
                        EditTextSpan editTextSpan5 = sendMomentEmojiAtPollView.f25163OoooO00;
                        if (editTextSpan5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("editContent");
                            editTextSpan5 = null;
                        }
                        editTextSpan5.OooO00o("@", oooOo);
                    }
                }
                EditTextSpan editTextSpan6 = SendMomentEmojiAtPollView.this.f25163OoooO00;
                if (editTextSpan6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editContent");
                } else {
                    editTextSpan = editTextSpan6;
                }
                editTextSpan.postDelayed(new o0O00000(SendMomentEmojiAtPollView.this, 1), 200L);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentEmojiAtPollView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO0O0() {
        o00O0000 o00o0001 = this.f25162OoooO0;
        if (o00o0001 == null || o00o0001 == null) {
            return;
        }
        o00o0001.OooO0OO();
    }

    public final void OooO0OO(boolean z) {
        this.f25159Oooo0o.f50692OooO0Oo.setClickable(z);
        this.f25159Oooo0o.f50692OooO0Oo.setImageResource(z ? R.drawable.ic_moment_add_poll : R.drawable.ic_moment_add_poll_gray);
    }

    public final void OooO0Oo() {
        this.f25159Oooo0o.f50692OooO0Oo.setVisibility(8);
    }

    public final void OooO0o0(boolean z) {
        EditTextSpan editTextSpan = this.f25163OoooO00;
        if (editTextSpan == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editContent");
            editTextSpan = null;
        }
        o000oOoO spanManager = editTextSpan.getSpanManager();
        if ((spanManager != null ? spanManager.OooO0Oo("@") : 0) >= this.f25158Oooo) {
            ToastUtil.OooO0O0 oooO0O0 = ToastUtil.f12567OooO00o;
            String strOooO0OO = o000O0O0.OooO0OO(R.string.Mention_a_maximum_of_XXX_people);
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
            sbOooO0o0.append(this.f25158Oooo);
            oooO0O0.OooO0O0(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, sbOooO0o0.toString()));
            return;
        }
        o00O0000 o00o0001 = this.f25162OoooO0;
        if (o00o0001 != null) {
            o00o0001.OooO0OO();
        }
        oo00o oo00oVarOooO00o = oo00o.f48621OooO0OO.OooO00o((FragmentActivity) getContext());
        oo00oVarOooO00o.f48623OooO0O0 = AtFriendsActivity.class;
        oo00oVarOooO00o.OooO00o(new OooO0O0(z));
    }

    @Nullable
    public final Function0<Unit> getAtListener() {
        return this.atListener;
    }

    @NotNull
    /* JADX INFO: renamed from: getBinding, reason: from getter */
    public final u9 getF25159Oooo0o() {
        return this.f25159Oooo0o;
    }

    @Nullable
    public final Function0<Unit> getPollListener() {
        return this.pollListener;
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
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentEmojiAtPollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        u9 u9VarInflate = u9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(u9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25159Oooo0o = u9VarInflate;
        OooO00o oooO00o = new OooO00o();
        u9VarInflate.f50690OooO0O0.setOnClickListener(oooO00o);
        u9VarInflate.f50692OooO0Oo.setOnClickListener(oooO00o);
        this.f25158Oooo = 10;
    }
}
