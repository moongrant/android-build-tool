package p492o0o00OO0;

import android.text.TextUtils;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p393o0Oo.oo000o;
import p466o0OooOoo.o0O0o00O;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000o extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f49312OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f49313OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000o(ShowImageActivity showImageActivity, String str) {
        super(1);
        this.f49312OooO0Oo = showImageActivity;
        this.f49313OooO0o0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            int i = ShowImageActivity.f25802Oooo00o;
            this.f49312OooO0Oo.getClass();
            StringBuilder sb = new StringBuilder("downloadImage urlImage = ");
            String str = this.f49313OooO0o0;
            sb.append(str);
            o0000O00.OooO0O0(sb.toString());
            if (!TextUtils.isEmpty(str)) {
                oo000o oo000oVar = new oo000o((File) o0O0o00O.f47843OooO.getValue());
                Intrinsics.checkNotNullExpressionValue(oo000oVar, "download(...)");
                oo000oVar.f43611OooO0Oo = new o0OO000();
                oo000oVar.OooO0O0(str);
            }
        }
        return Unit.INSTANCE;
    }
}
