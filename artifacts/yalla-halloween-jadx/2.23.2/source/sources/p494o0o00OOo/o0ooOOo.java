package p494o0o00OOo;

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
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentSendImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendImage.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImage$toGetImages$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1855#2,2:355\n*S KotlinDebug\n*F\n+ 1 MomentSendImage.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImage$toGetImages$2\n*L\n254#1:355,2\n*E\n"})
public final class o0ooOOo extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<MomentSelectMedia> f49606OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f49607OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f49608OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(ArrayList arrayList, o0OoOo0 o0oooo1, ArrayList arrayList2) {
        super(1);
        this.f49606OooO0Oo = arrayList;
        this.f49608OooO0o0 = o0oooo1;
        this.f49607OooO0o = arrayList2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        o0OoOo0 o0oooo1;
        SelectImageData selectImageData2 = selectImageData;
        o0000O00.OooO0O0("WRM SelectImageData data = " + selectImageData2);
        if (selectImageData2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f49606OooO0Oo);
            ArrayList<Uri> arrayListOooO00o = selectImageData2.OooO00o();
            Intrinsics.checkNotNullExpressionValue(arrayListOooO00o, "getSelectUri(...)");
            Iterator<T> it = arrayListOooO00o.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                o0oooo1 = this.f49608OooO0o0;
                if (!zHasNext) {
                    break;
                }
                Uri uri = (Uri) it.next();
                o0000O00.OooO0O0("WRM SelectImageData selectUri = " + uri);
                if (!this.f49607OooO0o.contains(uri)) {
                    MomentSendActivity momentSendActivity = o0oooo1.f49590OooO00o;
                    Intrinsics.checkNotNull(uri);
                    File fileOooO0O0 = Oooo000.OooO0O0(momentSendActivity, uri);
                    String absolutePath = fileOooO0O0 != null ? fileOooO0O0.getAbsolutePath() : null;
                    if (absolutePath == null) {
                        absolutePath = "";
                    } else {
                        Intrinsics.checkNotNull(absolutePath);
                    }
                    arrayList.add(new MomentSelectMedia(absolutePath));
                }
            }
            o0oooo1.f49592OooO0OO.OooOoO0(o0oooo1.OooO00o(arrayList));
            o0oooo1.OooO0Oo();
        }
        return Unit.INSTANCE;
    }
}
