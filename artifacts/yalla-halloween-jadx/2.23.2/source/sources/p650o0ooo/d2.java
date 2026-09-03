package p650o0ooo;

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
import o0OO0O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p368o0OOo0Oo.Oooo000;
import p401o0Oo0O00.OooO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class d2 extends OooO<String, String> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Room.MoraStartPkRequestReply f58184OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final SVGAView f58185OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Button f58186OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ArrayList f58187OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f58188OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(@NotNull MixedRoomActivity context, @NotNull Room.MoraStartPkRequestReply moraEndPkRequestReply) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moraEndPkRequestReply, "moraEndPkRequestReply");
        this.f58184OooO = moraEndPkRequestReply;
        this.f58185OooOO0 = (SVGAView) findViewById(o0OO00O.start_mora_game_animation);
        Button button = (Button) findViewById(o0OO00O.mora_game_svga_commit);
        this.f58186OooOO0O = button;
        ArrayList arrayList = new ArrayList();
        this.f58187OooOO0o = arrayList;
        this.f58188OooOOO0 = true;
        int i = o000000.win_anim;
        arrayList.add(o0000.OooO0OO(i));
        arrayList.add(o0000.OooO0OO(o000000.tie_anim));
        arrayList.add(o0000.OooO0OO(i));
        button.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d2 this$0 = this.f59224OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
            }
        });
        try {
            new OooO0OO(context).OooO00o("svga/mora_game_animation.svga", new b2(this));
        } catch (Exception unused) {
        }
        this.f58186OooOO0O.postDelayed(new Runnable() { // from class: o0ooo.z1
            @Override // java.lang.Runnable
            public final void run() {
                d2 this$0 = this.f59247OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f58186OooOO0O.setVisibility(0);
            }
        }, 2640L);
        this.f58185OooOO0.setCallback(new c2(this));
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.dialog_room_bottom_game_box_mora_process;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    public final void OooOO0o(OooOO0 oooOO1, String str, String str2, int i, float f) {
        try {
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0o0(str2);
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0OO(new a2(oooOO1, str, i, f));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        String price;
        AbsJavaBeanApi<RoomBroadcastModel> absJavaBeanApi;
        if (this.f58188OooOOO0) {
            MixedRoomDataSource mixedRoomDataSourceOooO0o0 = MixedRoomDataSource.OooO0o0();
            mixedRoomDataSourceOooO0o0.OooO0oO(mixedRoomDataSourceOooO0o0.f23000OooOOOO);
            Room.MoraStartPkRequestReply moraStartPkRequestReply = this.f58184OooO;
            if (moraStartPkRequestReply.getMoraresult() != 2) {
                RoomGiftModel roomGiftModel = mixedRoomDataSourceOooO0o0.f23003OooOOo0;
                if (roomGiftModel != null) {
                    mixedRoomDataSourceOooO0o0.OooOO0o(roomGiftModel, GiftPropTypePay.Coin.getValue(), Boolean.FALSE);
                }
                int moragiftid = moraStartPkRequestReply.getMoragiftid();
                ArrayList arrayList = mixedRoomDataSourceOooO0o0.f22998OooOOO;
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
                Intrinsics.checkNotNullExpressionValue(price, "getMoraGameImagePrice(...)");
                if (moraStartPkRequestReply.getMoranum() * Integer.parseInt(price) >= 1799 && (absJavaBeanApi = mixedRoomDataSourceOooO0o0.f23001OooOOOo) != null) {
                    mixedRoomDataSourceOooO0o0.OooOOOO(10019, absJavaBeanApi.getData());
                }
            }
            this.f58188OooOOO0 = false;
        }
        super.dismiss();
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(@Nullable View view) {
    }
}
