package p556o0oOOoOO;

import OooO00o.OooO00o;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.app.base.model.RoomModel;
import com.app.base.model.roomBroadcastModel.RoomBroadcastModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.ui.view.RoomBroadcastView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p159o00OoOO.o000O00O;
import p168o00Ooo0.oo000o;
import p515o0o0O00.o00O00;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0O0OoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HorizontalScrollView f44662OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Activity f44663OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public List<RoomBroadcastModel> f44664OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f44665OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public RoomBroadcastView f44666OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public oO0OOo0o f44667OooO0o0;

    public oO0O0OoO(Activity activity) {
        this.f44663OooO0O0 = activity;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) activity.findViewById(R.id.include_room_broadcast_new_bg_layout_content);
        this.f44662OooO00o = horizontalScrollView;
        horizontalScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: o0oOOoOO.oO000Oo0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        oO0OOo0o oo0ooo0o = new oO0OOo0o();
        this.f44667OooO0o0 = oo0ooo0o;
        oO000Oo oo000oo = new oO000Oo(this);
        TranslateAnimation translateAnimation = oo0ooo0o.f44668OooO00o;
        if (translateAnimation == null) {
            if (translateAnimation == null) {
                TranslateAnimation translateAnimation2 = new TranslateAnimation(2, 1.0f, 1, -1.0f, 2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                oo0ooo0o.f44668OooO00o = translateAnimation2;
                translateAnimation2.setInterpolator(new LinearInterpolator());
                oo0ooo0o.f44668OooO00o.setDuration(8000L);
            }
            oo0ooo0o.f44668OooO00o = oo0ooo0o.f44668OooO00o;
        }
        TranslateAnimation translateAnimation3 = oo0ooo0o.f44669OooO0O0;
        if (translateAnimation3 == null) {
            if (translateAnimation3 == null) {
                TranslateAnimation translateAnimation4 = new TranslateAnimation(1, -1.0f, 2, 1.0f, 2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                oo0ooo0o.f44669OooO0O0 = translateAnimation4;
                translateAnimation4.setInterpolator(new LinearInterpolator());
                oo0ooo0o.f44669OooO0O0.setDuration(8000L);
            }
            oo0ooo0o.f44669OooO0O0 = oo0ooo0o.f44669OooO0O0;
        }
        oo0ooo0o.f44668OooO00o.setAnimationListener(oo000oo);
        oo0ooo0o.f44669OooO0O0.setAnimationListener(oo000oo);
    }

    public static void OooO00o(oO0O0OoO oo0o0ooo) {
        HorizontalScrollView horizontalScrollView = oo0o0ooo.f44662OooO00o;
        if (horizontalScrollView != null) {
            horizontalScrollView.removeAllViews();
            oo0o0ooo.f44662OooO00o.setVisibility(8);
        }
        oo0o0ooo.f44665OooO0Oo = false;
        if (oo0o0ooo.OooO0Oo().size() > 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            RoomModel roomModel = o000O00O.OooO().f32429Oooo0oO;
            if (OooO0OO.OooO0O0(roomModel) && OooO0OO.OooO0O0(roomModel.getBaridx())) {
                for (RoomBroadcastModel roomBroadcastModel : oo0o0ooo.OooO0Oo()) {
                    if (roomModel.getBaridx().equals(Long.valueOf(roomBroadcastModel.getBaridx()))) {
                        switch (roomBroadcastModel.getType()) {
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 16:
                                arrayList2.add(roomBroadcastModel);
                                break;
                            case 11:
                            case 13:
                            default:
                                arrayList.add(roomBroadcastModel);
                                break;
                        }
                    } else {
                        arrayList.add(roomBroadcastModel);
                    }
                }
                oo0o0ooo.OooO0Oo().clear();
                if (arrayList2.size() > 0) {
                    oo0o0ooo.OooO0Oo().addAll(arrayList2);
                }
                oo0o0ooo.OooO0Oo().addAll(arrayList);
            }
            oo0o0ooo.OooO0o0();
        }
    }

    public final void OooO0O0(RoomBroadcastModel roomBroadcastModel) {
        if (roomBroadcastModel.getRoominfo() == null || roomBroadcastModel.getRoominfo().getId() != o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue().longValue()) {
            ((ArrayList) OooO0Oo()).add(roomBroadcastModel);
        } else {
            ((ArrayList) OooO0Oo()).add(0, roomBroadcastModel);
        }
    }

    public final void OooO0OO(RoomBroadcastModel roomBroadcastModel) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("收到广播 data.getType = ");
        sbOooO0o0.append(roomBroadcastModel.getType());
        sbOooO0o0.append(", broadcast = ");
        sbOooO0o0.append(roomBroadcastModel.toJSONString());
        o00O00.OooO0O0(sbOooO0o0.toString());
        if (roomBroadcastModel.getType() != 11) {
            OooO0O0(roomBroadcastModel);
            if (roomBroadcastModel.getType() == 12 || roomBroadcastModel.getType() == 13 || roomBroadcastModel.getType() == 14 || roomBroadcastModel.getType() == 22) {
                OooO0O0(roomBroadcastModel);
            }
            OooO0o0();
            return;
        }
        if (oo000o.OooO00o().equals(roomBroadcastModel.getLang())) {
            OooO0O0(roomBroadcastModel);
            OooO0o0();
        } else if (roomBroadcastModel.getLang().equals("id") && oo000o.OooO0O0() == 3) {
            OooO0O0(roomBroadcastModel);
            OooO0o0();
        }
    }

    public final List<RoomBroadcastModel> OooO0Oo() {
        if (this.f44664OooO0OO == null) {
            this.f44664OooO0OO = new ArrayList();
        }
        return this.f44664OooO0OO;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    public final void OooO0o0() {
        Object objM502constructorimpl;
        if (this.f44665OooO0Oo || OooO0Oo().isEmpty() || OooO0Oo().get(0) == null) {
            return;
        }
        boolean z = true;
        this.f44665OooO0Oo = true;
        this.f44662OooO00o.setVisibility(0);
        RoomBroadcastModel roomBroadcastModel = OooO0Oo().get(0);
        OooO0Oo().remove(0);
        if (this.f44666OooO0o == null) {
            RoomBroadcastView roomBroadcastView = new RoomBroadcastView(this.f44663OooO0O0);
            this.f44666OooO0o = roomBroadcastView;
            roomBroadcastView.setRoomBroadcastNewAnimation(this.f44667OooO0o0);
        }
        RoomBroadcastView roomBroadcastView2 = this.f44666OooO0o;
        roomBroadcastView2.f25104Oooo0oO = roomBroadcastModel;
        o00O00.OooO0O0("RoomBroadcastView setData = " + roomBroadcastModel);
        if (roomBroadcastModel == null || roomBroadcastModel.getType() == 19) {
            z = false;
        } else {
            roomBroadcastView2.f25103Oooo0o.f50327OooO0O0.setVisibility(0);
            roomBroadcastView2.f25103Oooo0o.f50327OooO0O0.setData(roomBroadcastModel);
            int type = roomBroadcastModel.getType();
            if (type == 21 || type == 22) {
                roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(true);
            } else if (type != 91) {
                switch (type) {
                    case 9:
                        roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(false);
                        break;
                    case 10:
                        roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(true);
                        break;
                    case 11:
                        roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(false);
                        break;
                    case 12:
                        roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(true);
                        break;
                    case 13:
                        roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(true);
                        break;
                    case 14:
                        roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(true);
                        break;
                    case 15:
                        roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(true);
                        break;
                    case 16:
                        roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(true);
                        break;
                    case 17:
                        roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(true);
                        break;
                    case 18:
                        roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(true);
                        break;
                    default:
                        roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(true);
                        z = false;
                        break;
                }
            } else {
                roomBroadcastView2.f25103Oooo0o.f50326OooO00o.setEnabled(false);
            }
        }
        if (z) {
            this.f44662OooO00o.removeAllViews();
            this.f44662OooO00o.addView(this.f44666OooO0o.getRootView());
            RoomBroadcastView roomBroadcastView3 = this.f44666OooO0o;
            oO000o00 onFailureCallBack = new oO000o00(this);
            Objects.requireNonNull(roomBroadcastView3);
            Intrinsics.checkNotNullParameter(onFailureCallBack, "onFailureCallBack");
            try {
                Result.Companion companion = Result.INSTANCE;
                roomBroadcastView3.getRootView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
                int measuredWidth = roomBroadcastView3.f25103Oooo0o.f50326OooO00o.getMeasuredWidth();
                if (roomBroadcastView3.f25102Oooo != null) {
                    int iOooO0O0 = (OooOo00.OooO0O0(measuredWidth) * roomBroadcastView3.f25105Oooo0oo) / 360;
                    oO0OOo0o oo0ooo0o = roomBroadcastView3.f25102Oooo;
                    Intrinsics.checkNotNull(oo0ooo0o);
                    if (oo0ooo0o.OooO00o() != null) {
                        oO0OOo0o oo0ooo0o2 = roomBroadcastView3.f25102Oooo;
                        Intrinsics.checkNotNull(oo0ooo0o2);
                        oo0ooo0o2.OooO00o().setDuration(roomBroadcastView3.f25105Oooo0oo + iOooO0O0);
                        LinearLayout linearLayout = roomBroadcastView3.f25103Oooo0o.f50326OooO00o;
                        oO0OOo0o oo0ooo0o3 = roomBroadcastView3.f25102Oooo;
                        Intrinsics.checkNotNull(oo0ooo0o3);
                        linearLayout.startAnimation(oo0ooo0o3.OooO00o());
                    }
                }
                objM502constructorimpl = Result.m502constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM502constructorimpl = Result.m502constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM505exceptionOrNullimpl = Result.m505exceptionOrNullimpl(objM502constructorimpl);
            if (thM505exceptionOrNullimpl != null) {
                o00O00.OooO0O0("startInAnimation  onFailure    " + thM505exceptionOrNullimpl);
                onFailureCallBack.invoke();
            }
        }
    }
}
