package p541o0o0Oo0o;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p206o00o0o0o.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000o extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ List<String> f44161Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00O000 f44162Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f44163Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(List<String> list, o00O000 o00o001, List<Uri> list2) {
        super(1);
        this.f44161Oooo0o = list;
        this.f44162Oooo0oO = o00o001;
        this.f44163Oooo0oo = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f44161Oooo0o);
            ArrayList<Uri> arrayListOooO00o = selectImageData2.OooO00o();
            Intrinsics.checkNotNullExpressionValue(arrayListOooO00o, "data.selectUri");
            List<Uri> list = this.f44163Oooo0oo;
            o00O000 o00o001 = this.f44162Oooo0oO;
            for (Uri uri : arrayListOooO00o) {
                if (!list.contains(uri)) {
                    String strOooO0O0 = o000Oo0.OooO0O0(o00o001.f44145OooO00o, uri);
                    Intrinsics.checkNotNullExpressionValue(strOooO0O0, "getPathFromMediaUri(activity, it)");
                    arrayList.add(strOooO0O0);
                }
            }
            o00O000 o00o002 = this.f44162Oooo0oO;
            o00o002.f44148OooO0Oo.setNewData(o00o002.OooO00o(arrayList));
            this.f44162Oooo0oO.OooO0OO();
        }
        return Unit.INSTANCE;
    }
}
