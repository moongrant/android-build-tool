package p581o0oOoOOo;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.common.model.ShareChannel;
import com.yalla.yalla.common.model.ShareModel;
import com.yalla.yalla.common.model.ShareType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p255o00ooO0O.o00O000;
import p518o0o0O000.o00000O0;
import p606o0oo00oO.ooOOOOoo;
import p608o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ShareType f46319Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ ShareChannel f46320OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ShareModel f46321OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ ooOOOOoo f46322OoooO0O;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            iArr[ShareChannel.Friends.ordinal()] = 1;
            iArr[ShareChannel.Moments.ordinal()] = 2;
            iArr[ShareChannel.Facebook.ordinal()] = 3;
            iArr[ShareChannel.Twitter.ordinal()] = 4;
            iArr[ShareChannel.Instagram.ordinal()] = 5;
            iArr[ShareChannel.WhatsApp.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ShareType shareType, ShareModel shareModel, ShareChannel shareChannel, ooOOOOoo oooooooo) {
        super(0);
        this.f46319Oooo = shareType;
        this.f46321OoooO00 = shareModel;
        this.f46320OoooO0 = shareChannel;
        this.f46322OoooO0O = oooooooo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ShareType shareType = this.f46319Oooo;
        ShareModel shareModel = this.f46321OoooO00;
        ShareChannel shareChannel = this.f46320OoooO0;
        o00O000 o00o001 = o00O000.f34368OooO00o;
        Activity activityOooO0O0 = o00O000.OooO0O0();
        Intrinsics.checkNotNull(activityOooO0O0);
        o00000O0 o00000o1 = new o00000O0((FragmentActivity) activityOooO0O0, shareType);
        o00000o1.f42085OooO00o = shareModel;
        o00000o1.OooO00o(shareChannel);
        this.f46322OoooO0O.f48301OooO00o.setValue(Boolean.FALSE);
        switch (OooO00o.$EnumSwitchMapping$0[this.f46320OoooO0.ordinal()]) {
            case 1:
                OooOo.OooO0O0("102251");
                break;
            case 2:
                OooOo.OooO0O0("102252");
                break;
            case 3:
                OooOo.OooO0O0("102253");
                break;
            case 4:
                OooOo.OooO0O0("102254");
                break;
            case 5:
                OooOo.OooO0O0("102255");
                break;
            case 6:
                OooOo.OooO0O0("102256");
                break;
        }
        return Unit.INSTANCE;
    }
}
