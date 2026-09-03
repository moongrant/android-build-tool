package p519o0o0O0oO;

import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.room.Room;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.facebook.appevents.AppEventsConstants;
import com.opensource.svgaplayer.OooO0OO;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.MoraGiftListModel;
import com.yalla.yalla.model.RoomBroadcastModel;
import com.yalla.yalla.model.RoomGiftModel;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import com.yalla.yalla.model.gift.GiftPropTypePay;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O000o0;
import p139o00OOooO.OooO0o;
import p391o0Oo0.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class d2 extends OooOO0<String, String> {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f52195OooOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Room.MoraStartPkRequestReply f52196OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final SVGAView f52197OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Button f52198OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ArrayList f52199OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f52200OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(@NotNull MixedRoomActivity context, @NotNull Room.MoraStartPkRequestReply moraEndPkRequestReply) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moraEndPkRequestReply, "moraEndPkRequestReply");
        this.f52196OooO = moraEndPkRequestReply;
        this.f52197OooOO0 = (SVGAView) findViewById(oO00O0oO.start_mora_game_animation);
        Button button = (Button) findViewById(oO00O0oO.mora_game_svga_commit);
        this.f52198OooOO0O = button;
        ArrayList arrayList = new ArrayList();
        this.f52199OooOO0o = arrayList;
        this.f52200OooOOO0 = true;
        int i = oO00OOo0.win_anim;
        arrayList.add(o0000.OooO0OO(i));
        arrayList.add(o0000.OooO0OO(oO00OOo0.tie_anim));
        arrayList.add(o0000.OooO0OO(i));
        button.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d2 this$0 = this.f53242OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
            }
        });
        try {
            new OooO0OO(context).OooO00o("svga/mora_game_animation.svga", new b2(this));
        } catch (Exception unused) {
        }
        this.f52198OooOO0O.postDelayed(new o0O000o0(this, 1), 2640L);
        this.f52197OooOO0.setCallback(new c2(this));
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.dialog_room_bottom_game_box_mora_process;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    public final void OooOO0o(o0OO0O0.OooOO0 oooOO1, String str, String str2, int i, float f) {
        try {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(getContext());
            oooO00o.f43911OooO0OO = OooO0o.OooO0o0(str2);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0OO(new a2(oooOO1, str, i, f));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        String price;
        AbsJavaBeanApi<RoomBroadcastModel> absJavaBeanApi;
        if (this.f52200OooOOO0) {
            MixedRoomDataSource mixedRoomDataSourceOooO0o0 = MixedRoomDataSource.OooO0o0();
            mixedRoomDataSourceOooO0o0.OooO0oO(mixedRoomDataSourceOooO0o0.f23469OooOOOO);
            Room.MoraStartPkRequestReply moraStartPkRequestReply = this.f52196OooO;
            if (moraStartPkRequestReply.getMoraresult() != 2) {
                RoomGiftModel roomGiftModel = mixedRoomDataSourceOooO0o0.f23472OooOOo0;
                if (roomGiftModel != null) {
                    mixedRoomDataSourceOooO0o0.OooOO0o(roomGiftModel, GiftPropTypePay.Coin.getValue(), Boolean.FALSE);
                }
                int moragiftid = moraStartPkRequestReply.getMoragiftid();
                ArrayList arrayList = mixedRoomDataSourceOooO0o0.f23467OooOOO;
                if (arrayList.size() <= 0) {
                    price = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                    break;
                }
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        price = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                        break;
                    } else {
                        if (moragiftid == ((MoraGiftListModel) arrayList.get(i)).getPropId()) {
                            price = ((MoraGiftListModel) arrayList.get(i)).getPrice();
                            break;
                        }
                        i++;
                    }
                }
                Intrinsics.checkNotNullExpressionValue(price, "getMoraGameImagePrice(moragiftid, mActivity)");
                if (moraStartPkRequestReply.getMoranum() * Integer.parseInt(price) >= 1799 && (absJavaBeanApi = mixedRoomDataSourceOooO0o0.f23470OooOOOo) != null) {
                    mixedRoomDataSourceOooO0o0.OooOOOO(10019, absJavaBeanApi.getData());
                }
            }
            this.f52200OooOOO0 = false;
        }
        super.dismiss();
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(@Nullable View view) {
    }
}
