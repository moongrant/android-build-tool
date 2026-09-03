package p579o0oOoOOo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.GiftRoomModel;
import com.app.base.model.MoraGiftListModel;
import com.app.base.model.roomBroadcastModel.RoomBroadcastModel;
import com.app.base.protobuf.room.Room;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.GiftPropTypePay;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035OoooOO0.o0000Ooo;
import p146o00Oo000.OooO0O0;
import p159o00OoOO.o000O00O;
import p254o00ooO0O.o000O0O0;
import p405o0Oo0OO0.OooOO0;
import p508o0o00oOo.o000O0;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class y extends OooO0O0<String, String> {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f46365OoooOOO = 0;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Button f46366OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final Room.MoraStartPkRequestReply f46367OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final SVGAView f46368OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final List<String> f46369OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f46370o000oOoO;

    public static final class OooO00o extends com.yalla.yalla.util.netimage.listener.OooO00o<BitmapDrawable> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ float f46371Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0 f46372Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f46373Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f46374Oooo0oo;

        public OooO00o(OooOO0 oooOO1, String str, int i, float f) {
            this.f46372Oooo0o = oooOO1;
            this.f46373Oooo0oO = str;
            this.f46374Oooo0oo = i;
            this.f46371Oooo = f;
        }

        @Override // com.yalla.yalla.util.netimage.listener.OooO00o
        public final void onSuccess(BitmapDrawable bitmapDrawable) {
            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            if (bitmapDrawable2 != null) {
                OooOO0 oooOO1 = this.f46372Oooo0o;
                String str = this.f46373Oooo0oO;
                int i = this.f46374Oooo0oo;
                float f = this.f46371Oooo;
                int width = bitmapDrawable2.getBitmap().getWidth();
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(bitmapShader);
                Bitmap bitmap2 = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap2);
                float f2 = width / 2.0f;
                canvas.drawCircle(f2, f2, f2, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmapDrawable2.getBitmap(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, paint);
                Intrinsics.checkNotNullExpressionValue(bitmap2, "bitmap");
                oooOO1.OooO00o(bitmap2, str);
                Paint paint2 = new Paint(1);
                paint2.setColor(i);
                paint2.setAntiAlias(true);
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeWidth(OooOo00.OooO00o(f));
                canvas.drawCircle(f2, f2, (width - OooOo00.OooO00o(f)) / 2.0f, paint2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull Context context, @NotNull Room.MoraStartPkRequestReply moraEndPkRequestReply) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moraEndPkRequestReply, "moraEndPkRequestReply");
        this.f46367OoooO0 = moraEndPkRequestReply;
        this.f46368OoooO0O = (SVGAView) findViewById(R.id.start_mora_game_animation);
        Button button = (Button) findViewById(R.id.mora_game_svga_commit);
        this.f46366OoooO = button;
        ArrayList arrayList = new ArrayList();
        this.f46369OoooOO0 = arrayList;
        this.f46370o000oOoO = true;
        arrayList.add(o000O0O0.OooO0OO(R.string.win_anim));
        arrayList.add(o000O0O0.OooO0OO(R.string.tie_anim));
        arrayList.add(o000O0O0.OooO0OO(R.string.win_anim));
        button.setOnClickListener(new o000O0(this, 1));
        try {
            new p405o0Oo0OO0.OooOo00((MixedRoomActivity) context).OooO0oO("svga/mora_game_animation.svga", new z(this));
        } catch (Exception unused) {
        }
        this.f46366OoooO.postDelayed(new o0000Ooo(this, 3), 2640L);
        this.f46368OoooO0O.setCallback(new a0(this));
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.dialog_room_bottom_game_box_mora_process;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    public final OooOO0 OooOOO(OooOO0 oooOO1, String str, String str2, int i, float f) {
        try {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgPng(str2);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o0(new OooO00o(oooOO1, str, i, f));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return oooOO1;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList, java.util.List<com.app.base.model.MoraGiftListModel>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<com.app.base.model.MoraGiftListModel>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.MoraGiftListModel>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList, java.util.List<com.app.base.model.MoraGiftListModel>] */
    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        String price;
        AbsJavaBeanApi<RoomBroadcastModel> absJavaBeanApi;
        if (this.f46370o000oOoO) {
            o000O00O o000o00oOooO = o000O00O.OooO();
            o000o00oOooO.OooOOoo(o000o00oOooO.f32440OoooOoo);
            Room.MoraStartPkRequestReply moraStartPkRequestReply = this.f46367OoooO0;
            if (moraStartPkRequestReply.getMoraresult() != 2) {
                GiftRoomModel giftRoomModel = o000o00oOooO.f32442Ooooo0o;
                if (giftRoomModel != null) {
                    o000o00oOooO.OooOoO(giftRoomModel, GiftPropTypePay.Coin.getValue(), Boolean.FALSE);
                }
                int moragiftid = moraStartPkRequestReply.getMoragiftid();
                if (o000o00oOooO.f32439OoooOoO.size() <= 0) {
                    price = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                    break;
                }
                int i = 0;
                while (true) {
                    if (i >= o000o00oOooO.f32439OoooOoO.size()) {
                        price = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                        break;
                    } else {
                        if (moragiftid == ((MoraGiftListModel) o000o00oOooO.f32439OoooOoO.get(i)).getPropId()) {
                            price = ((MoraGiftListModel) o000o00oOooO.f32439OoooOoO.get(i)).getPrice();
                            break;
                        }
                        i++;
                    }
                }
                Intrinsics.checkNotNullExpressionValue(price, "getMoraGameImagePrice(moragiftid, mActivity)");
                if (moraStartPkRequestReply.getMoranum() * Integer.parseInt(price) >= 1799 && (absJavaBeanApi = o000o00oOooO.f32441Ooooo00) != null) {
                    o000o00oOooO.OooOooO(10019, 0, absJavaBeanApi.getData());
                }
            }
            this.f46370o000oOoO = false;
        }
        super.dismiss();
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(@Nullable View view) {
    }
}
