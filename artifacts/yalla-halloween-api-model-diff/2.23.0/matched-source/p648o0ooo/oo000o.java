package p648o0ooo;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareLogType;
import com.yalla.yalla.model.share.ShareWebModel;
import com.yalla.yalla.ui.view.pop.roomSharePop.RoomShareModel;
import com.yalla.yalla.ui.vm.ShareLogViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p362o0OOo0O.OooOO0;
import p519o0o0O0oO.o00O00OO;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.w1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f59784OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ShareLogViewModel f59785OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f59786OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f59787OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f59788OooO0o0;

    public static final class OooO00o extends o00O00OO {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @NotNull
        public final FragmentActivity f59789OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @NotNull
        public final Lazy f59790OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public String f59791OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public String f59792OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @Nullable
        public ShareContentType f59793OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @Nullable
        public Function1<? super String, Unit> f59794OooOOOo;

        /* JADX INFO: renamed from: o0ooo.oo000o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0517OooO00o extends Lambda implements Function0<w1> {
            public C0517OooO00o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final w1 invoke() {
                OooO00o oooO00o = OooO00o.this;
                w1 w1VarInflate = w1.inflate(LayoutInflater.from(oooO00o.f52532OooO0Oo), oooO00o.f52533OooO0o, true);
                Intrinsics.checkNotNullExpressionValue(w1VarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
                return w1VarInflate;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull FragmentActivity activity) {
            super(activity, 0);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f59789OooOO0O = activity;
            this.f59790OooOO0o = LazyKt.lazy(new C0517OooO00o());
            OooOO0().f59121OooO0o0.setOnClickListener(new o00Ooo(this, 0));
        }

        @Override // p519o0o0O0oO.o00O00OO
        public final void OooO() {
            super.OooO();
            TextView textView = OooOO0().f59120OooO0Oo;
            String str = this.f59791OooOOO;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            ViewGroup.LayoutParams layoutParams = OooOO0().f59118OooO0O0.getLayoutParams();
            layoutParams.height = this.f59793OooOOOO == ShareContentType.Events ? (int) (((double) layoutParams.width) * 0.564d) : layoutParams.width;
            OooOO0().f59118OooO0O0.setLayoutParams(layoutParams);
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f59789OooOO0O);
            String str2 = this.f59792OooOOO0;
            oooO00o.f43911OooO0OO = str2 != null ? str2 : "";
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(OooOO0().f59118OooO0O0);
        }

        public final w1 OooOO0() {
            return (w1) this.f59790OooOO0o.getValue();
        }
    }

    public /* synthetic */ class OooO0O0 {
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

    public static final class OooO0OO extends Lambda implements Function0<OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO00o invoke() {
            return new OooO00o(oo000o.this.f59784OooO00o);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f59798OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ShareContentModel f59799OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ShareContentModel shareContentModel, String str) {
            super(0);
            this.f59799OooO0o0 = shareContentModel;
            this.f59798OooO0o = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oo000o.this.f59785OooO0O0.shareLog(this.f59799OooO0o0.getType(), String.valueOf(this.f59798OooO0o), ShareLogType.Instagram);
            return Unit.INSTANCE;
        }
    }

    public oo000o(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f59784OooO00o = activity;
        this.f59785OooO0O0 = (ShareLogViewModel) new ViewModelProvider(activity).get(ShareLogViewModel.class);
        this.f59786OooO0OO = 1703;
        this.f59787OooO0Oo = "com.instagram.android";
        this.f59788OooO0o0 = LazyKt.lazy(new OooO0OO());
    }

    public final OooO00o OooO00o() {
        return (OooO00o) this.f59788OooO0o0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(@Nullable ShareContentModel shareContentModel) {
        String strOooO00o;
        String imageUrl;
        if (shareContentModel == null) {
            return;
        }
        int i = OooO0O0.$EnumSwitchMapping$0[shareContentModel.getType().ordinal()];
        String roomid = null;
        roomid = null;
        roomid = null;
        if (i == 1) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.room_gift);
            String[] strArr = new String[1];
            RoomShareModel room = shareContentModel.getRoom();
            strArr[0] = room != null ? room.getRoomIdx() : null;
            strOooO00o = o0000O.OooO00o(strOooO0OO, strArr);
            RoomShareModel room2 = shareContentModel.getRoom();
            imageUrl = room2 != null ? room2.getImageUrl() : null;
            RoomShareModel room3 = shareContentModel.getRoom();
            if (room3 != null) {
                roomid = room3.getRoomid();
            }
        } else if (i == 2) {
            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.room_gift);
            String[] strArr2 = new String[1];
            ShareWebModel web = shareContentModel.getWeb();
            strArr2[0] = web != null ? web.getIdx() : null;
            strOooO00o = o0000O.OooO00o(strOooO0OO2, strArr2);
            ShareWebModel web2 = shareContentModel.getWeb();
            imageUrl = web2 != null ? web2.getImagesUrl() : null;
            ShareWebModel web3 = shareContentModel.getWeb();
            if (web3 != null) {
                roomid = web3.getId();
            }
        } else if (i == 3) {
            ShareWebModel web4 = shareContentModel.getWeb();
            strOooO00o = web4 != null ? web4.getTitle() : null;
            ShareWebModel web5 = shareContentModel.getWeb();
            imageUrl = web5 != null ? web5.getImagesUrl() : null;
            ShareWebModel web6 = shareContentModel.getWeb();
            if (web6 != null) {
                roomid = web6.getId();
            }
        } else {
            if (i != 4) {
                Intrinsics.checkNotNullParameter("Error：unsupported share type", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                return;
            }
            String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.event_share_instagram);
            String[] strArr3 = new String[1];
            EventModel event = shareContentModel.getEvent();
            strArr3[0] = String.valueOf(event != null ? Long.valueOf(event.getRoomIdx()) : null);
            strOooO00o = o0000O.OooO00o(strOooO0OO3, strArr3);
            EventModel event2 = shareContentModel.getEvent();
            imageUrl = event2 != null ? event2.getEventImage() : null;
            EventModel event3 = shareContentModel.getEvent();
            roomid = String.valueOf(event3 != null ? Long.valueOf(event3.getId()) : null);
        }
        ShareContentType type = shareContentModel.getType();
        OooO0o oooO0o = new OooO0o(shareContentModel, roomid);
        if ((strOooO00o == null || strOooO00o.length() == 0) != false) {
            if (imageUrl == null || imageUrl.length() == 0) {
                return;
            }
        }
        OooO00o().f59791OooOOO = strOooO00o;
        OooO00o().f59792OooOOO0 = imageUrl;
        OooO00o().f59793OooOOOO = type;
        OooO00o().f59794OooOOOo = new o0OOO0o(this, oooO0o);
        OooO00o().OooO();
    }
}
