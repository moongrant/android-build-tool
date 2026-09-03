package p488o0o00O0o;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.code.android.util.Oooo000;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentSendImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendImage.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImage$toGetImages$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1855#2,2:355\n*S KotlinDebug\n*F\n+ 1 MomentSendImage.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImage$toGetImages$2\n*L\n254#1:355,2\n*E\n"})
public final class o00000 extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<MomentSelectMedia> f48418OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f48419OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f48420OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(ArrayList arrayList, o0OO00O o0oo00o2, ArrayList arrayList2) {
        super(1);
        this.f48418OooO0Oo = arrayList;
        this.f48420OooO0o0 = o0oo00o2;
        this.f48419OooO0o = arrayList2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        o0OO00O o0oo00o2;
        SelectImageData selectImageData2 = selectImageData;
        OooOOO0.OooO0O0("WRM SelectImageData data = " + selectImageData2);
        if (selectImageData2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f48418OooO0Oo);
            ArrayList<Uri> arrayListOooO00o = selectImageData2.OooO00o();
            Intrinsics.checkNotNullExpressionValue(arrayListOooO00o, "data.selectUri");
            Iterator<T> it = arrayListOooO00o.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                o0oo00o2 = this.f48420OooO0o0;
                if (!zHasNext) {
                    break;
                }
                Uri it2 = (Uri) it.next();
                OooOOO0.OooO0O0("WRM SelectImageData selectUri = " + it2);
                if (!this.f48419OooO0o.contains(it2)) {
                    MomentSendActivity momentSendActivity = o0oo00o2.f48448OooO00o;
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    File fileOooO0O0 = Oooo000.OooO0O0(momentSendActivity, it2);
                    String absolutePath = fileOooO0O0 != null ? fileOooO0O0.getAbsolutePath() : null;
                    if (absolutePath == null) {
                        absolutePath = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getFileFromMediaUri(acti…, it)?.absolutePath ?: \"\"");
                    }
                    arrayList.add(new MomentSelectMedia(absolutePath));
                }
            }
            o0oo00o2.f48450OooO0OO.OooOoO0(o0oo00o2.OooO00o(arrayList));
            o0oo00o2.OooO0Oo();
        }
        return Unit.INSTANCE;
    }
}
