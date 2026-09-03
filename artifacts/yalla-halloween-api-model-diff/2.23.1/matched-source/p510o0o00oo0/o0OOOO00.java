package p510o0o00oo0;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.RedPaperStateModel;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.room.OpenRedRnvelopesActivity;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p370o0OOo0Oo.Oooo000;
import p386o0OOoo0O.o000oOoO;
import p402o0Oo0O0.OooOOO0;
import p565o0oOo000.o000OOo;
import p587o0oOooO.oO00Oo0;
import p597o0oo00O.OooOOOO;
import p645o0ooOOO0.o0O0O0Oo;
import p675oO0Oo.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO00 extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ChatModel f50648OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOOO0o f50649OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbsListenerTag.values().length];
            try {
                iArr[AbsListenerTag.Ok.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbsListenerTag.Default.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ m1 f50650OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOOO0o f50651OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OOOO0o o0oooo0o, m1 m1Var, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            this.f50651OooO0o0 = o0oooo0o;
            this.f50650OooO0o = m1Var;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(@NotNull String code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.OooO0O0(code, message);
            this.f50650OooO0o.dismiss();
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            o0OOOO0o o0oooo0o = this.f50651OooO0o0;
            Intent intent = new Intent(o0oooo0o.f50654OooO00o, (Class<?>) OpenRedRnvelopesActivity.class);
            intent.putExtra("response", response);
            o0oooo0o.f50654OooO00o.startActivity(intent);
            this.f50650OooO0o.dismiss();
        }
    }

    public static final class OooO0OO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ m1 f50652OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOOO0o f50653OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0OOOO0o o0oooo0o, m1 m1Var, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            this.f50653OooO0o0 = o0oooo0o;
            this.f50652OooO0o = m1Var;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            o0OOOO0o o0oooo0o = this.f50653OooO0o0;
            Intent intent = new Intent(o0oooo0o.f50654OooO00o, (Class<?>) OpenRedRnvelopesActivity.class);
            intent.putExtra("response", response);
            o0oooo0o.f50654OooO00o.startActivity(intent);
            this.f50652OooO0o.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(o0OOOO0o o0oooo0o, ChatModel chatModel, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f50649OooO0o0 = o0oooo0o;
        this.f50648OooO0o = chatModel;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(@NotNull String code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.OooO0O0(code, message);
        this.f50649OooO0o0.f50655OooO0O0 = false;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        m1 m1Var;
        Intrinsics.checkNotNullParameter(response, "response");
        final RedPaperStateModel redPaperStateModel = (RedPaperStateModel) oO00Oo0.OooO00o(response, RedPaperStateModel.class);
        OooOOOO.OooO0O0("redPaperGetCheck \n RedPaperStateModel.toJSONString = " + redPaperStateModel.toJSONString());
        final o0OOOO0o o0oooo0o = this.f50649OooO0o0;
        if (OooOo00.OooO0O0(o0oooo0o.f50654OooO00o)) {
            FragmentActivity fragmentActivity = o0oooo0o.f50654OooO00o;
            if (!fragmentActivity.isFinishing()) {
                redPaperStateModel.getState();
                RedPaperStateModel.Companion companion = RedPaperStateModel.INSTANCE;
                if (companion.getRobbed() == redPaperStateModel.getState()) {
                    Intent intent = new Intent(fragmentActivity, (Class<?>) OpenRedRnvelopesActivity.class);
                    intent.putExtra("response", response);
                    fragmentActivity.startActivity(intent);
                    o0oooo0o.f50655OooO0O0 = false;
                    return;
                }
                o0oooo0o.f50656OooO0OO = new m1(fragmentActivity);
                int state = redPaperStateModel.getState();
                int canGrab = companion.getCanGrab();
                final ChatModel chatModel = this.f50648OooO0o;
                if (state == canGrab) {
                    String strOooO0OO = o0000.OooO0OO(o000OOo.red_best_wishes);
                    if (!Intrinsics.areEqual("", chatModel.getMessage())) {
                        strOooO0OO = String.valueOf(chatModel.getMessage());
                    }
                    m1 m1Var2 = o0oooo0o.f50656OooO0OO;
                    if (m1Var2 != null) {
                        m1Var2.OooOOO0(strOooO0OO);
                        m1Var2.OooOO0o(true);
                    }
                } else if (state == companion.getFinished() && (m1Var = o0oooo0o.f50656OooO0OO) != null) {
                    m1Var.OooOOO0(o0000.OooO0OO(o000OOo.red_best_luck));
                    m1Var.OooOO0o(false);
                }
                final m1 m1Var3 = o0oooo0o.f50656OooO0OO;
                if (m1Var3 != null) {
                    RoomUserInfoModel newFrom = chatModel.getNewFrom();
                    Intrinsics.checkNotNull(newFrom);
                    String value = newFrom.getUserHeader().getValue();
                    NetImageView netImageView = m1Var3.f59376OooOO0o;
                    if (netImageView != null) {
                        netImageView.setImageDrawable(null);
                        m1Var3.f59376OooOO0o.setVisibility(8);
                        if (!TextUtils.isEmpty(value)) {
                            m1Var3.f59376OooOO0o.setVisibility(0);
                            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(m1Var3.getContext());
                            oooO00o.OooO00o(o0O0O0Oo.OooO00o());
                            oooO00o.OooO0O0(0, 0);
                            oooO00o.f43127OooO0OO = p405o0Oo0OO.OooO0OO.OooO00o(value);
                            oooO00o.f43125OooO00o = 0;
                            oooO00o.OooO0Oo(m1Var3.f59376OooOO0o);
                        }
                    }
                    RoomUserInfoModel newFrom2 = chatModel.getNewFrom();
                    Intrinsics.checkNotNull(newFrom2);
                    String value2 = newFrom2.getUserName().getValue();
                    TextView textView = m1Var3.f59378OooOOO0;
                    if (textView != null) {
                        textView.setText("");
                        m1Var3.f59378OooOOO0.setVisibility(8);
                        if (!TextUtils.isEmpty(value2)) {
                            m1Var3.f59378OooOOO0.setText(value2);
                            m1Var3.f59378OooOOO0.setVisibility(0);
                        }
                    }
                    m1Var3.f43645OooO0o = new OooOOO0() { // from class: o0o00oo0.o0OOO0
                        @Override // p402o0Oo0O0.OooOOO0
                        public final void OooO00o(int i, Object obj, Object obj2) {
                            AbsListenerTag absListenerTag = (AbsListenerTag) obj2;
                            ChatModel chatModel2 = chatModel;
                            Intrinsics.checkNotNullParameter(chatModel2, "$chatModel");
                            o0OOOO0o this$0 = o0oooo0o;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            m1 this_apply = m1Var3;
                            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                            int i2 = absListenerTag == null ? -1 : o0OOOO00.OooO00o.$EnumSwitchMapping$0[absListenerTag.ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    return;
                                }
                                String id = chatModel2.getId();
                                o0OOOO00.OooO0OO oooO0OO = new o0OOOO00.OooO0OO(this$0, this_apply, this$0.f50654OooO00o);
                                LinkedHashMap linkedHashMapOooO00o = p428o0OoO0o0.OooOOOO.OooO00o();
                                linkedHashMapOooO00o.put("redid", id);
                                oooO0OO.f22931OooO0O0 = true;
                                oooO0OO.f22932OooO0OO = o0000.OooO0OO(o000OOo.loading);
                                OooO0OO.OooO0O0(null, o000oOoO.f43359OooOoo, o000oOoO.f43366Oooo00O, linkedHashMapOooO00o, oooO0OO);
                                return;
                            }
                            if (RedPaperStateModel.INSTANCE.getCanGrab() == redPaperStateModel.getState()) {
                                String id2 = chatModel2.getId();
                                o0OOOO00.OooO0O0 oooO0O0 = new o0OOOO00.OooO0O0(this$0, this_apply, this$0.f50654OooO00o);
                                LinkedHashMap linkedHashMapOooO00o2 = p428o0OoO0o0.OooOOOO.OooO00o();
                                linkedHashMapOooO00o2.put("redid", id2);
                                oooO0O0.f22931OooO0O0 = true;
                                oooO0O0.f22932OooO0OO = o0000.OooO0OO(o000OOo.loading);
                                OooO0OO.OooO0O0(null, o000oOoO.f43359OooOoo, o000oOoO.f43440o0Oo0oo, linkedHashMapOooO00o2, oooO0O0);
                            }
                        }
                    };
                    m1Var3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0o00oo0.o0OOO0OO
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            o0OOOO0o this$0 = o0oooo0o;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.f50655OooO0O0 = false;
                        }
                    });
                    m1Var3.show();
                    return;
                }
                return;
            }
        }
        o0oooo0o.f50655OooO0O0 = false;
    }
}
