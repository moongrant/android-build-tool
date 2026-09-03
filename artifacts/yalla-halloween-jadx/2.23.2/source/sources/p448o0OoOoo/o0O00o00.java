package p448o0OoOoo;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.text.AnnotatedString;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o00 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f47474OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f47475OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f47476OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o00(AnnotatedString annotatedString, String str, Context context) {
        super(1);
        this.f47474OooO0Oo = annotatedString;
        this.f47476OooO0o0 = str;
        this.f47475OooO0o = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        if (((AnnotatedString.Range) CollectionsKt.firstOrNull((List) this.f47474OooO0Oo.getStringAnnotations(this.f47476OooO0o0, iIntValue, iIntValue))) != null) {
            int i = RoomSettingActivity.f26191Oooo00O;
            Context context = this.f47475OooO0o;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            RoomSettingActivity.OooO00o.OooO00o((Activity) context, String.valueOf(OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue()));
        }
        return Unit.INSTANCE;
    }
}
