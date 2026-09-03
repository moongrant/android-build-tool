package p614o0oo0o;

import com.yalla.yalla.ui.vm.moment.TopicGroupCreateVM;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.group.create.bean.GroupCreateRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ String f57525OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f57526OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f57527OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f57528OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f57529OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f57530OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseResp, Unit> f57531OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(o000oOoO o000oooo2, String str, String str2, String str3, String str4, String str5, TopicGroupCreateVM.OooO oooO) {
        super(0);
        this.f57526OooO0Oo = o000oooo2;
        this.f57528OooO0o0 = str;
        this.f57527OooO0o = str2;
        this.f57529OooO0oO = str3;
        this.f57530OooO0oo = str4;
        this.f57525OooO = str5;
        this.f57531OooOO0 = oooO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        YCSDKOpenKit.sendReq$default(YCSDKOpenKit.INSTANCE, this.f57526OooO0Oo.f57514OooO00o, new GroupCreateRequest(this.f57528OooO0o0, this.f57527OooO0o, this.f57529OooO0oO, this.f57530OooO0oo, this.f57525OooO), new o00Oo0(this.f57531OooOO0), null, 8, null);
        return Unit.INSTANCE;
    }
}
