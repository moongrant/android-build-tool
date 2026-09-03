package p538o0o0Oo0;

import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00oO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f44103Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f44104Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00oO(ShowImageActivity showImageActivity, String str) {
        super(1);
        this.f44103Oooo0o = showImageActivity;
        this.f44104Oooo0oO = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            ShowImageActivity showImageActivity = this.f44103Oooo0o;
            String str = this.f44104Oooo0oO;
            ShowImageActivity.OooO00o oooO00o = ShowImageActivity.f22515o00o0O;
            showImageActivity.OooOoo0(str);
        }
        return Unit.INSTANCE;
    }
}
