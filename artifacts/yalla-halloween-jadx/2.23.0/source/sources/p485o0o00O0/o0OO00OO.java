package p485o0o00O0;

import android.text.TextUtils;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p230o00oOoO0.o0000O00;
import p415o0Oo0ooO.x0;
import p416o0Oo0ooo.y0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f47989OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f47990OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00OO(ShowImageActivity showImageActivity, String str) {
        super(1);
        this.f47989OooO0Oo = showImageActivity;
        this.f47990OooO0o0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            int i = ShowImageActivity.f26251Oooo00o;
            this.f47989OooO0Oo.getClass();
            StringBuilder sb = new StringBuilder("downloadImage urlImage = ");
            String str = this.f47990OooO0o0;
            sb.append(str);
            OooOOO0.OooO0O0(sb.toString());
            if (!TextUtils.isEmpty(str)) {
                x0 x0Var = new x0((File) y0.f45406OooO.getValue());
                Intrinsics.checkNotNullExpressionValue(x0Var, "download(mediaImage)");
                x0Var.f45401OooO0Oo = new o0000O00();
                x0Var.OooO0O0(str);
            }
        }
        return Unit.INSTANCE;
    }
}
