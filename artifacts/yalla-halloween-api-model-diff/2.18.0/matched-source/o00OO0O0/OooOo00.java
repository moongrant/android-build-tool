package o00OO0O0;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.model.ChatModel;
import com.app.base.model.RedPaperStateModel;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.ui.activity.room.OpenRedRnvelopesActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p177o00OoooO.oO000Oo0;
import p618o0oo0Ooo.oO0O000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends o00OoOO0.o00OO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f31425OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ChatModel f31426OooO0O0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbsListenerTag.values().length];
            iArr[AbsListenerTag.Ok.ordinal()] = 1;
            iArr[AbsListenerTag.Default.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(Oooo0 oooo0, ChatModel chatModel, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f31425OooO00o = oooo0;
        this.f31426OooO0O0 = chatModel;
    }

    @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
    public final void onError(@NotNull String code2, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code2, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onError(code2, message);
        this.f31425OooO00o.f31428OooO0O0 = false;
    }

    @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
    public final void onFinish(@NotNull String response) {
        oO000Oo0 oo000oo0;
        Intrinsics.checkNotNullParameter(response, "response");
        final RedPaperStateModel redPaperStateModel = (RedPaperStateModel) com.android.billingclient.api.o0Oo0oo.OooO0O0(response, RedPaperStateModel.class);
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("redPaperGetCheck \n RedPaperStateModel.toJSONString = ");
        sbOooO0O0.append(redPaperStateModel.toJSONString());
        p517o0o0O00.o00O00.OooO0O0(sbOooO0O0.toString());
        if (!com.yalla.support.common.util.OooO0OO.OooO0O0(this.f31425OooO00o.f31427OooO00o) || this.f31425OooO00o.f31427OooO00o.isFinishing()) {
            this.f31425OooO00o.f31428OooO0O0 = false;
            return;
        }
        redPaperStateModel.getState();
        RedPaperStateModel.Companion companion = RedPaperStateModel.INSTANCE;
        if (companion.getRobbed() == redPaperStateModel.getState()) {
            Intent intent = new Intent(this.f31425OooO00o.f31427OooO00o, (Class<?>) OpenRedRnvelopesActivity.class);
            intent.putExtra("response", response);
            this.f31425OooO00o.f31427OooO00o.startActivity(intent);
            this.f31425OooO00o.f31428OooO0O0 = false;
            return;
        }
        this.f31425OooO00o.f31429OooO0OO = new oO000Oo0(this.f31425OooO00o.f31427OooO00o);
        int state = redPaperStateModel.getState();
        if (state == companion.getCanGrab()) {
            String strOooO0OO = p255o00ooO0O.o000O0O0.OooO0OO(R.string.red_best_wishes);
            if (!Intrinsics.areEqual("", this.f31426OooO0O0.message)) {
                strOooO0OO = this.f31426OooO0O0.message;
                Intrinsics.checkNotNullExpressionValue(strOooO0OO, "chatModel.message");
            }
            oO000Oo0 oo000oo1 = this.f31425OooO00o.f31429OooO0OO;
            if (oo000oo1 != null) {
                oo000oo1.OooOOOO(strOooO0OO);
                oo000oo1.OooOOO(true);
            }
        } else if (state == companion.getFinished() && (oo000oo0 = this.f31425OooO00o.f31429OooO0OO) != null) {
            oo000oo0.OooOOOO(p255o00ooO0O.o000O0O0.OooO0OO(R.string.red_best_luck));
            oo000oo0.OooOOO(false);
        }
        final Oooo0 oooo0 = this.f31425OooO00o;
        final oO000Oo0 oo000oo2 = oooo0.f31429OooO0OO;
        if (oo000oo2 != null) {
            final ChatModel chatModel = this.f31426OooO0O0;
            String userHeader = chatModel.from.getUserHeader();
            NetImageView netImageView = oo000oo2.f32818OoooOOo;
            if (netImageView != null) {
                netImageView.setImageDrawable(null);
                oo000oo2.f32818OoooOOo.setVisibility(8);
                if (!TextUtils.isEmpty(userHeader)) {
                    oo000oo2.f32818OoooOOo.setVisibility(0);
                    oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(oo000oo2.getContext());
                    oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
                    oooO00o.OooO0OO(0, 0);
                    oooO00o.f48447OooO0OO = CloudImageUtilKt.imgSize(userHeader, com.yalla.support.common.util.OooOo00.OooO00o(40), true);
                    oooO00o.f48445OooO00o = 0;
                    oooO00o.OooO0o(oo000oo2.f32818OoooOOo);
                }
            }
            String userName = chatModel.from.getUserName();
            TextView textView = oo000oo2.f32819OoooOo0;
            if (textView != null) {
                textView.setText("");
                oo000oo2.f32819OoooOo0.setVisibility(8);
                if (!TextUtils.isEmpty(userName)) {
                    oo000oo2.f32819OoooOo0.setText(userName);
                    oo000oo2.f32819OoooOo0.setVisibility(0);
                }
            }
            oo000oo2.f32174OoooO0 = new o00Oo00.OooO0O0() { // from class: o00OO0O0.OooOOOO
                @Override // o00Oo00.OooO0O0
                public final void OooO0O0(Object obj, int i, Object obj2) {
                    RedPaperStateModel redPaperStateModel2 = redPaperStateModel;
                    ChatModel chatModel2 = chatModel;
                    Oooo0 this$0 = oooo0;
                    oO000Oo0 this_apply = oo000oo2;
                    AbsListenerTag absListenerTag = (AbsListenerTag) obj2;
                    Intrinsics.checkNotNullParameter(chatModel2, "$chatModel");
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    int i2 = absListenerTag == null ? -1 : OooOo00.OooO00o.$EnumSwitchMapping$0[absListenerTag.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            return;
                        }
                        String str = chatModel2.id;
                        Oooo000 oooo000 = new Oooo000(this$0, this_apply, this$0.f31427OooO00o);
                        Map<String, String> mapOooO0O0 = p161o00OoOO0.o00OO0OO.OooO0O0();
                        mapOooO0O0.put("redid", str);
                        oooo000.setHaveBeforeAfter(true);
                        oooo000.setTitle(p255o00ooO0O.o000O0O0.OooO0OO(R.string.loading));
                        p154o00Oo0oO.o0ooOOo o0ooooo2 = p154o00Oo0oO.o0ooOOo.f32239OooO00o;
                        p161o00OoOO0.o00OO0OO.OooO0OO(null, p154o00Oo0oO.o0ooOOo.f32265OooOoo, p154o00Oo0oO.o0ooOOo.f32272Oooo00O, mapOooO0O0, oooo000);
                        return;
                    }
                    if (RedPaperStateModel.INSTANCE.getCanGrab() == redPaperStateModel2.getState()) {
                        String str2 = chatModel2.id;
                        OooOo oooOo = new OooOo(this$0, this_apply, this$0.f31427OooO00o);
                        Map<String, String> mapOooO0O1 = p161o00OoOO0.o00OO0OO.OooO0O0();
                        mapOooO0O1.put("redid", str2);
                        oooOo.setHaveBeforeAfter(true);
                        oooOo.setTitle(p255o00ooO0O.o000O0O0.OooO0OO(R.string.loading));
                        p154o00Oo0oO.o0ooOOo o0ooooo3 = p154o00Oo0oO.o0ooOOo.f32239OooO00o;
                        p161o00OoOO0.o00OO0OO.OooO0OO(null, p154o00Oo0oO.o0ooOOo.f32265OooOoo, p154o00Oo0oO.o0ooOOo.f32342o000OOo, mapOooO0O1, oooOo);
                    }
                }
            };
            oo000oo2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o00OO0O0.OooOOO
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Oooo0 this$0 = oooo0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.f31428OooO0O0 = false;
                }
            });
            oo000oo2.show();
        }
    }
}
