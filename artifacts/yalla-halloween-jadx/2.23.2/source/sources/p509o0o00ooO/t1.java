package p509o0o00ooO;

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
import p368o0OOo0Oo.Oooo000;
import p384o0OOoo0O.Oooo0;
import p400o0Oo0O0.OooOOO0;
import p426o0OoO0o0.OooOOOO;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOOO00;
import p598o0oo00Oo.o0000O00;
import p642o0ooOOO0.d1;
import p650o0ooo.n;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ChatModel f50812OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ u1 f50813OooO0o0;

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
        public final /* synthetic */ n f50814OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ u1 f50815OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(u1 u1Var, n nVar, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            this.f50815OooO0o0 = u1Var;
            this.f50814OooO0o = nVar;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(@NotNull String code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.OooO0O0(code, message);
            this.f50814OooO0o.dismiss();
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            u1 u1Var = this.f50815OooO0o0;
            Intent intent = new Intent(u1Var.f50838OooO00o, (Class<?>) OpenRedRnvelopesActivity.class);
            intent.putExtra("response", response);
            u1Var.f50838OooO00o.startActivity(intent);
            this.f50814OooO0o.dismiss();
        }
    }

    public static final class OooO0OO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ n f50816OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ u1 f50817OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(u1 u1Var, n nVar, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            this.f50817OooO0o0 = u1Var;
            this.f50816OooO0o = nVar;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            u1 u1Var = this.f50817OooO0o0;
            Intent intent = new Intent(u1Var.f50838OooO00o, (Class<?>) OpenRedRnvelopesActivity.class);
            intent.putExtra("response", response);
            u1Var.f50838OooO00o.startActivity(intent);
            this.f50816OooO0o.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, ChatModel chatModel, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f50813OooO0o0 = u1Var;
        this.f50812OooO0o = chatModel;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(@NotNull String code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.OooO0O0(code, message);
        this.f50813OooO0o0.f50839OooO0O0 = false;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        n nVar;
        Intrinsics.checkNotNullParameter(response, "response");
        final RedPaperStateModel redPaperStateModel = (RedPaperStateModel) oOOO00.OooO00o(response, RedPaperStateModel.class);
        o0000O00.OooO0O0("redPaperGetCheck \n RedPaperStateModel.toJSONString = " + redPaperStateModel.toJSONString());
        final u1 u1Var = this.f50813OooO0o0;
        if (OooOo00.OooO0O0(u1Var.f50838OooO00o)) {
            FragmentActivity fragmentActivity = u1Var.f50838OooO00o;
            if (!fragmentActivity.isFinishing()) {
                redPaperStateModel.getState();
                RedPaperStateModel.Companion companion = RedPaperStateModel.INSTANCE;
                if (companion.getRobbed() == redPaperStateModel.getState()) {
                    Intent intent = new Intent(fragmentActivity, (Class<?>) OpenRedRnvelopesActivity.class);
                    intent.putExtra("response", response);
                    fragmentActivity.startActivity(intent);
                    u1Var.f50839OooO0O0 = false;
                    return;
                }
                u1Var.f50840OooO0OO = new n(fragmentActivity);
                int state = redPaperStateModel.getState();
                int canGrab = companion.getCanGrab();
                final ChatModel chatModel = this.f50812OooO0o;
                if (state == canGrab) {
                    String strOooO0OO = o0000.OooO0OO(o000000.red_best_wishes);
                    if (!Intrinsics.areEqual("", chatModel.getMessage())) {
                        strOooO0OO = String.valueOf(chatModel.getMessage());
                    }
                    n nVar2 = u1Var.f50840OooO0OO;
                    if (nVar2 != null) {
                        nVar2.OooOOO0(strOooO0OO);
                        nVar2.OooOO0o(true);
                    }
                } else if (state == companion.getFinished() && (nVar = u1Var.f50840OooO0OO) != null) {
                    nVar.OooOOO0(o0000.OooO0OO(o000000.red_best_luck));
                    nVar.OooOO0o(false);
                }
                final n nVar3 = u1Var.f50840OooO0OO;
                if (nVar3 != null) {
                    RoomUserInfoModel newFrom = chatModel.getNewFrom();
                    Intrinsics.checkNotNull(newFrom);
                    String value = newFrom.getUserHeader().getValue();
                    NetImageView netImageView = nVar3.f58398OooOO0o;
                    if (netImageView != null) {
                        netImageView.setImageDrawable(null);
                        nVar3.f58398OooOO0o.setVisibility(8);
                        if (!TextUtils.isEmpty(value)) {
                            nVar3.f58398OooOO0o.setVisibility(0);
                            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(nVar3.getContext());
                            oooO00o.OooO00o(d1.OooO00o());
                            oooO00o.OooO0O0(0, 0);
                            oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(value);
                            oooO00o.f43124OooO00o = 0;
                            oooO00o.OooO0Oo(nVar3.f58398OooOO0o);
                        }
                    }
                    RoomUserInfoModel newFrom2 = chatModel.getNewFrom();
                    Intrinsics.checkNotNull(newFrom2);
                    String value2 = newFrom2.getUserName().getValue();
                    TextView textView = nVar3.f58400OooOOO0;
                    if (textView != null) {
                        textView.setText("");
                        nVar3.f58400OooOOO0.setVisibility(8);
                        if (!TextUtils.isEmpty(value2)) {
                            nVar3.f58400OooOOO0.setText(value2);
                            nVar3.f58400OooOOO0.setVisibility(0);
                        }
                    }
                    nVar3.f43649OooO0o = new OooOOO0() { // from class: o0o00ooO.r1
                        @Override // p400o0Oo0O0.OooOOO0
                        public final void OooO00o(int i, Object obj, Object obj2) {
                            AbsListenerTag absListenerTag = (AbsListenerTag) obj2;
                            ChatModel chatModel2 = chatModel;
                            Intrinsics.checkNotNullParameter(chatModel2, "$chatModel");
                            u1 this$0 = u1Var;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            n this_apply = nVar3;
                            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                            int i2 = absListenerTag == null ? -1 : t1.OooO00o.$EnumSwitchMapping$0[absListenerTag.ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    return;
                                }
                                String id = chatModel2.getId();
                                t1.OooO0OO oooO0OO = new t1.OooO0OO(this$0, this_apply, this$0.f50838OooO00o);
                                LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
                                linkedHashMapOooO00o.put("redid", id);
                                oooO0OO.f22926OooO0O0 = true;
                                oooO0OO.f22927OooO0OO = o0000.OooO0OO(o000000.loading);
                                OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43366Oooo00O, linkedHashMapOooO00o, oooO0OO);
                                return;
                            }
                            if (RedPaperStateModel.INSTANCE.getCanGrab() == redPaperStateModel.getState()) {
                                String id2 = chatModel2.getId();
                                t1.OooO0O0 oooO0O0 = new t1.OooO0O0(this$0, this_apply, this$0.f50838OooO00o);
                                LinkedHashMap linkedHashMapOooO00o2 = OooOOOO.OooO00o();
                                linkedHashMapOooO00o2.put("redid", id2);
                                oooO0O0.f22926OooO0O0 = true;
                                oooO0O0.f22927OooO0OO = o0000.OooO0OO(o000000.loading);
                                OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43440o0Oo0oo, linkedHashMapOooO00o2, oooO0O0);
                            }
                        }
                    };
                    nVar3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0o00ooO.s1
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            u1 this$0 = u1Var;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.f50839OooO0O0 = false;
                        }
                    });
                    nVar3.show();
                    return;
                }
                return;
            }
        }
        u1Var.f50839OooO0O0 = false;
    }
}
