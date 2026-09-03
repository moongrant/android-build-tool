package p648o0ooo;

import android.content.Intent;
import android.os.Looper;
import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareLogType;
import com.yalla.yalla.model.share.ShareWebModel;
import com.yalla.yalla.ui.activity.BaseAppCompatActivity;
import com.yalla.yalla.ui.view.pop.roomSharePop.RoomShareModel;
import com.yalla.yalla.ui.vm.ShareLogViewModel;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f59745OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ShareLogViewModel f59746OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f59747OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f59748OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareContentType.values().length];
            try {
                iArr[ShareContentType.Room.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareContentType.Web.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareContentType.WebH5Content.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareContentType.Events.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f59750OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ShareContentModel f59751OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ShareContentModel shareContentModel, String str) {
            super(0);
            this.f59751OooO0o0 = shareContentModel;
            this.f59750OooO0o = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00000O0.this.f59746OooO0O0.shareLog(this.f59751OooO0o0.getType(), String.valueOf(this.f59750OooO0o), ShareLogType.WhatsApp);
            return Unit.INSTANCE;
        }
    }

    public o00000O0(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f59745OooO00o = activity;
        this.f59746OooO0O0 = (ShareLogViewModel) new ViewModelProvider(activity).get(ShareLogViewModel.class);
        this.f59747OooO0OO = 1704;
        this.f59748OooO0Oo = "com.whatsapp";
    }

    /* JADX WARN: Code duplicated, block: B:94:0x0171 A[Catch: Exception -> 0x01b8, TryCatch #0 {Exception -> 0x01b8, blocks: (B:92:0x016d, B:94:0x0171, B:95:0x017b), top: B:106:0x016d }] */
    public final void OooO00o(@Nullable ShareContentModel shareContentModel) {
        String strOooO00o;
        String strOooO00o2;
        String title;
        String str;
        FragmentActivity fragmentActivity;
        if (shareContentModel == null) {
            return;
        }
        int i = OooO00o.$EnumSwitchMapping$0[shareContentModel.getType().ordinal()];
        String roomIdx = null;
        String str2 = null;
        roomIdx = null;
        roomIdx = null;
        try {
            if (i == 1) {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.room_gift);
                String[] strArr = new String[1];
                RoomShareModel room = shareContentModel.getRoom();
                strArr[0] = room != null ? room.getRoomIdx() : null;
                strOooO00o = o0000O.OooO00o(strOooO0OO, strArr);
                RoomShareModel room2 = shareContentModel.getRoom();
                String url = room2 != null ? room2.getUrl() : null;
                RoomShareModel room3 = shareContentModel.getRoom();
                strOooO00o2 = o0OoOo0.OooO00o(url, "?RoomId=", room3 != null ? room3.getRoomIdx() : null);
                RoomShareModel room4 = shareContentModel.getRoom();
                if (room4 != null) {
                    room4.getImageUrl();
                }
                RoomShareModel room5 = shareContentModel.getRoom();
                title = room5 != null ? room5.getTitle() : null;
                RoomShareModel room6 = shareContentModel.getRoom();
                if (room6 != null) {
                    roomIdx = room6.getRoomIdx();
                }
            } else if (i == 2) {
                String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.room_gift);
                String[] strArr2 = new String[1];
                ShareWebModel web = shareContentModel.getWeb();
                strArr2[0] = web != null ? web.getIdx() : null;
                strOooO00o = o0000O.OooO00o(strOooO0OO2, strArr2);
                ShareWebModel web2 = shareContentModel.getWeb();
                String url2 = web2 != null ? web2.getUrl() : null;
                ShareWebModel web3 = shareContentModel.getWeb();
                strOooO00o2 = o0OoOo0.OooO00o(url2, "?RoomId=", web3 != null ? web3.getId() : null);
                ShareWebModel web4 = shareContentModel.getWeb();
                if (web4 != null) {
                    web4.getImagesUrl();
                }
                ShareWebModel web5 = shareContentModel.getWeb();
                title = web5 != null ? web5.getTitle() : null;
                ShareWebModel web6 = shareContentModel.getWeb();
                if (web6 != null) {
                    roomIdx = web6.getIdx();
                }
            } else {
                if (i != 3) {
                    if (i != 4) {
                        Intrinsics.checkNotNullParameter("Error：unsupported share type", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                        strOooO00o = null;
                        str = null;
                        title = null;
                    } else {
                        strOooO00o = o0000.OooO0OO(oO00OOo0.event_share_twitter);
                        EventModel event = shareContentModel.getEvent();
                        strOooO00o2 = event != null ? event.getEventShareUrl() : null;
                        EventModel event2 = shareContentModel.getEvent();
                        if (event2 != null) {
                            event2.getEventImage();
                        }
                        EventModel event3 = shareContentModel.getEvent();
                        title = event3 != null ? event3.getEventName() : null;
                        EventModel event4 = shareContentModel.getEvent();
                        roomIdx = String.valueOf(event4 != null ? Long.valueOf(event4.getRoomIdx()) : null);
                    }
                    OooO0O0 oooO0O0 = new OooO0O0(shareContentModel, str2);
                    fragmentActivity = this.f59745OooO00o;
                    StringBuilder sbOooO0OO = OooO0o.OooO0OO("toShare title = ", title, ", content = ", strOooO00o, ", shareUrl = ");
                    sbOooO0OO.append(str);
                    OooOOO0.OooO0O0(sbOooO0OO.toString());
                    if (fragmentActivity instanceof BaseAppCompatActivity) {
                        ((BaseAppCompatActivity) fragmentActivity).f25139OooO0o0 = new o00000O(this);
                    }
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setPackage(this.f59748OooO0Oo);
                    intent.putExtra("android.intent.extra.TEXT", title + ZegoConstants.ZegoVideoDataAuxPublishingStream + strOooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + str);
                    intent.setType("text/plain");
                    intent.addFlags(1);
                    fragmentActivity.startActivityForResult(intent, this.f59747OooO0OO);
                    oooO0O0.invoke();
                    return;
                }
                ShareWebModel web7 = shareContentModel.getWeb();
                strOooO00o = web7 != null ? web7.getContent() : null;
                ShareWebModel web8 = shareContentModel.getWeb();
                strOooO00o2 = web8 != null ? web8.getUrl() : null;
                ShareWebModel web9 = shareContentModel.getWeb();
                if (web9 != null) {
                    web9.getImagesUrl();
                }
                ShareWebModel web10 = shareContentModel.getWeb();
                title = web10 != null ? web10.getTitle() : null;
                ShareWebModel web11 = shareContentModel.getWeb();
                if (web11 != null) {
                    roomIdx = web11.getIdx();
                }
            }
            if (fragmentActivity instanceof BaseAppCompatActivity) {
                ((BaseAppCompatActivity) fragmentActivity).f25139OooO0o0 = new o00000O(this);
            }
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.SEND");
            intent2.setPackage(this.f59748OooO0Oo);
            intent2.putExtra("android.intent.extra.TEXT", title + ZegoConstants.ZegoVideoDataAuxPublishingStream + strOooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + str);
            intent2.setType("text/plain");
            intent2.addFlags(1);
            fragmentActivity.startActivityForResult(intent2, this.f59747OooO0OO);
            oooO0O0.invoke();
            return;
        } catch (Exception e) {
            e.printStackTrace();
            String strOooO00o3 = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Please_install_XXX), o0000.OooO0OO(oO00OOo0.single_third_whatsApp));
            if (StringsKt.isBlank(strOooO00o3)) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO00o3, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        str2 = roomIdx;
        str = strOooO00o2;
        OooO0O0 oooO0O1 = new OooO0O0(shareContentModel, str2);
        fragmentActivity = this.f59745OooO00o;
        StringBuilder sbOooO0OO2 = OooO0o.OooO0OO("toShare title = ", title, ", content = ", strOooO00o, ", shareUrl = ");
        sbOooO0OO2.append(str);
        OooOOO0.OooO0O0(sbOooO0OO2.toString());
    }
}
