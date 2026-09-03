package p543o0o0OoO0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000OO0O;
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
import p370o0OOo0Oo.Oooo000;
import p407o0Oo0OOO.o0O00o00;
import p565o0oOo000.o000OOo;
import p675oO0Oo.o0oO0Ooo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f54911OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ShareLogViewModel f54912OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f54913OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f54914OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f54915OooO0o0;

    public static final class OooO00o extends o0oO0Ooo {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @NotNull
        public final FragmentActivity f54916OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @NotNull
        public final Lazy f54917OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public String f54918OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public String f54919OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @Nullable
        public ShareContentType f54920OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @Nullable
        public Function1<? super String, Unit> f54921OooOOOo;

        /* JADX INFO: renamed from: o0o0OoO0.oo00oO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0490OooO00o extends Lambda implements Function0<o0O00o00> {
            public C0490OooO00o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final o0O00o00 invoke() {
                OooO00o oooO00o = OooO00o.this;
                o0O00o00 o0o00o00Inflate = o0O00o00.inflate(LayoutInflater.from(oooO00o.f59572OooO0Oo), oooO00o.f59573OooO0o, true);
                Intrinsics.checkNotNullExpressionValue(o0o00o00Inflate, "inflate(...)");
                return o0o00o00Inflate;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull FragmentActivity activity) {
            super(activity, 0);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f54916OooOO0O = activity;
            this.f54917OooOO0o = LazyKt.lazy(new C0490OooO00o());
            OooOO0().f44464OooO0o0.setOnClickListener(new o000OO0O(this, 1));
        }

        @Override // p675oO0Oo.o0oO0Ooo
        public final void OooO() {
            super.OooO();
            TextView textView = OooOO0().f44463OooO0Oo;
            String str = this.f54918OooOOO;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            ViewGroup.LayoutParams layoutParams = OooOO0().f44461OooO0O0.getLayoutParams();
            layoutParams.height = this.f54920OooOOOO == ShareContentType.Events ? (int) (((double) layoutParams.width) * 0.564d) : layoutParams.width;
            OooOO0().f44461OooO0O0.setLayoutParams(layoutParams);
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f54916OooOO0O);
            String str2 = this.f54919OooOOO0;
            oooO00o.f43127OooO0OO = str2 != null ? str2 : "";
            oooO00o.f43125OooO00o = 0;
            oooO00o.OooO0Oo(OooOO0().f44461OooO0O0);
        }

        public final o0O00o00 OooOO0() {
            return (o0O00o00) this.f54917OooOO0o.getValue();
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
            return new OooO00o(oo00oO.this.f54911OooO00o);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f54925OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ShareContentModel f54926OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ShareContentModel shareContentModel, String str) {
            super(0);
            this.f54926OooO0o0 = shareContentModel;
            this.f54925OooO0o = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oo00oO.this.f54912OooO0O0.shareLog(this.f54926OooO0o0.getType(), String.valueOf(this.f54925OooO0o), ShareLogType.Instagram);
            return Unit.INSTANCE;
        }
    }

    public oo00oO(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f54911OooO00o = activity;
        this.f54912OooO0O0 = (ShareLogViewModel) new ViewModelProvider(activity).get(ShareLogViewModel.class);
        this.f54913OooO0OO = 1703;
        this.f54914OooO0Oo = "com.instagram.android";
        this.f54915OooO0o0 = LazyKt.lazy(new OooO0OO());
    }

    public final OooO00o OooO00o() {
        return (OooO00o) this.f54915OooO0o0.getValue();
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
            String strOooO0OO = o0000.OooO0OO(o000OOo.room_gift);
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
            String strOooO0OO2 = o0000.OooO0OO(o000OOo.room_gift);
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
            String strOooO0OO3 = o0000.OooO0OO(o000OOo.event_share_instagram);
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
        OooO00o().f54918OooOOO = strOooO00o;
        OooO00o().f54919OooOOO0 = imageUrl;
        OooO00o().f54920OooOOOO = type;
        OooO00o().f54921OooOOOo = new o0(this, oooO0o);
        OooO00o().OooO();
    }
}
