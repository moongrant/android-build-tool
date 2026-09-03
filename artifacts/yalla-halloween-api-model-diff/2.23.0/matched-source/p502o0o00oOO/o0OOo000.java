package p502o0o00oOO;

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
import p362o0OOo0O.OooOO0;
import p377o0OOoOo.o0000O;
import p396o0Oo0O.OooOOO;
import p519o0o0O0oO.j;
import p543o0oO0O00.OooO;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;
import p629o0ooO0O0.o0000Ooo;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOo000 extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ChatModel f49478OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0o0000 f49479OooO0o0;

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
        public final /* synthetic */ j f49480OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0o0000 f49481OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0o0000 o0o0000Var, j jVar, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            this.f49481OooO0o0 = o0o0000Var;
            this.f49480OooO0o = jVar;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(@NotNull String code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.OooO0O0(code, message);
            this.f49480OooO0o.dismiss();
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            o0o0000 o0o0000Var = this.f49481OooO0o0;
            Intent intent = new Intent(o0o0000Var.f49484OooO00o, (Class<?>) OpenRedRnvelopesActivity.class);
            intent.putExtra("response", response);
            o0o0000Var.f49484OooO00o.startActivity(intent);
            this.f49480OooO0o.dismiss();
        }
    }

    public static final class OooO0OO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ j f49482OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0o0000 f49483OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0o0000 o0o0000Var, j jVar, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            this.f49483OooO0o0 = o0o0000Var;
            this.f49482OooO0o = jVar;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            o0o0000 o0o0000Var = this.f49483OooO0o0;
            Intent intent = new Intent(o0o0000Var.f49484OooO00o, (Class<?>) OpenRedRnvelopesActivity.class);
            intent.putExtra("response", response);
            o0o0000Var.f49484OooO00o.startActivity(intent);
            this.f49482OooO0o.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOo000(o0o0000 o0o0000Var, ChatModel chatModel, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f49479OooO0o0 = o0o0000Var;
        this.f49478OooO0o = chatModel;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(@NotNull String code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.OooO0O0(code, message);
        this.f49479OooO0o0.f49485OooO0O0 = false;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        j jVar;
        Intrinsics.checkNotNullParameter(response, "response");
        final RedPaperStateModel redPaperStateModel = (RedPaperStateModel) oOo00OO0.OooO00o(response, RedPaperStateModel.class);
        OooOOO0.OooO0O0("redPaperGetCheck \n RedPaperStateModel.toJSONString = " + redPaperStateModel.toJSONString());
        final o0o0000 o0o0000Var = this.f49479OooO0o0;
        if (OooOo00.OooO0O0(o0o0000Var.f49484OooO00o)) {
            FragmentActivity fragmentActivity = o0o0000Var.f49484OooO00o;
            if (!fragmentActivity.isFinishing()) {
                redPaperStateModel.getState();
                RedPaperStateModel.Companion companion = RedPaperStateModel.INSTANCE;
                if (companion.getRobbed() == redPaperStateModel.getState()) {
                    Intent intent = new Intent(fragmentActivity, (Class<?>) OpenRedRnvelopesActivity.class);
                    intent.putExtra("response", response);
                    fragmentActivity.startActivity(intent);
                    o0o0000Var.f49485OooO0O0 = false;
                    return;
                }
                o0o0000Var.f49486OooO0OO = new j(fragmentActivity);
                int state = redPaperStateModel.getState();
                int canGrab = companion.getCanGrab();
                final ChatModel chatModel = this.f49478OooO0o;
                if (state == canGrab) {
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.red_best_wishes);
                    if (!Intrinsics.areEqual("", chatModel.getMessage())) {
                        strOooO0OO = String.valueOf(chatModel.getMessage());
                    }
                    j jVar2 = o0o0000Var.f49486OooO0OO;
                    if (jVar2 != null) {
                        jVar2.OooOOO0(strOooO0OO);
                        jVar2.OooOO0o(true);
                    }
                } else if (state == companion.getFinished() && (jVar = o0o0000Var.f49486OooO0OO) != null) {
                    jVar.OooOOO0(o0000.OooO0OO(oO00OOo0.red_best_luck));
                    jVar.OooOO0o(false);
                }
                final j jVar3 = o0o0000Var.f49486OooO0OO;
                if (jVar3 != null) {
                    RoomUserInfoModel newFrom = chatModel.getNewFrom();
                    Intrinsics.checkNotNull(newFrom);
                    String value = newFrom.getUserHeader().getValue();
                    NetImageView netImageView = jVar3.f52368OooOO0o;
                    if (netImageView != null) {
                        netImageView.setImageDrawable(null);
                        jVar3.f52368OooOO0o.setVisibility(8);
                        if (!TextUtils.isEmpty(value)) {
                            jVar3.f52368OooOO0o.setVisibility(0);
                            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(jVar3.getContext());
                            oooO00o.OooO00o(OooO.OooO00o());
                            oooO00o.OooO0O0(0, 0);
                            oooO00o.f43911OooO0OO = OooOOO.OooO00o(value);
                            oooO00o.f43909OooO00o = 0;
                            oooO00o.OooO0Oo(jVar3.f52368OooOO0o);
                        }
                    }
                    RoomUserInfoModel newFrom2 = chatModel.getNewFrom();
                    Intrinsics.checkNotNull(newFrom2);
                    String value2 = newFrom2.getUserName().getValue();
                    TextView textView = jVar3.f52370OooOOO0;
                    if (textView != null) {
                        textView.setText("");
                        jVar3.f52370OooOOO0.setVisibility(8);
                        if (!TextUtils.isEmpty(value2)) {
                            jVar3.f52370OooOOO0.setText(value2);
                            jVar3.f52370OooOOO0.setVisibility(0);
                        }
                    }
                    jVar3.f44397OooO0o = new o0000Ooo() { // from class: o0o00oOO.o0OOOO00
                        @Override // p629o0ooO0O0.o0000Ooo
                        public final void OooO00o(int i, Object obj, Object obj2) {
                            AbsListenerTag absListenerTag = (AbsListenerTag) obj2;
                            ChatModel chatModel2 = chatModel;
                            Intrinsics.checkNotNullParameter(chatModel2, "$chatModel");
                            o0o0000 this$0 = o0o0000Var;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            j this_apply = jVar3;
                            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                            int i2 = absListenerTag == null ? -1 : o0OOo000.OooO00o.$EnumSwitchMapping$0[absListenerTag.ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    return;
                                }
                                String id = chatModel2.getId();
                                o0OOo000.OooO0OO oooO0OO = new o0OOo000.OooO0OO(this$0, this_apply, this$0.f49484OooO00o);
                                LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
                                linkedHashMapOooO00o.put("redid", id);
                                oooO0OO.f23395OooO0O0 = true;
                                oooO0OO.f23396OooO0OO = o0000.OooO0OO(oO00OOo0.loading);
                                OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44107Oooo00O, linkedHashMapOooO00o, oooO0OO);
                                return;
                            }
                            if (RedPaperStateModel.INSTANCE.getCanGrab() == redPaperStateModel.getState()) {
                                String id2 = chatModel2.getId();
                                o0OOo000.OooO0O0 oooO0O0 = new o0OOo000.OooO0O0(this$0, this_apply, this$0.f49484OooO00o);
                                LinkedHashMap linkedHashMapOooO00o2 = oO00o000.OooO00o();
                                linkedHashMapOooO00o2.put("redid", id2);
                                oooO0O0.f23395OooO0O0 = true;
                                oooO0O0.f23396OooO0OO = o0000.OooO0OO(oO00OOo0.loading);
                                OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44181o0Oo0oo, linkedHashMapOooO00o2, oooO0O0);
                            }
                        }
                    };
                    jVar3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0o00oOO.o0OOOO0o
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            o0o0000 this$0 = o0o0000Var;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.f49485OooO0O0 = false;
                        }
                    });
                    jVar3.show();
                    return;
                }
                return;
            }
        }
        o0o0000Var.f49485OooO0O0 = false;
    }
}
