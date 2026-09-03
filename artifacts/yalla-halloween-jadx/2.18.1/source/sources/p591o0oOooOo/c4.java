package p591o0oOooOo;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.yalla.yalla.ui.vm.event.EventCreateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class c4 extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventCreateViewModel f47200Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(EventCreateViewModel eventCreateViewModel) {
        super(1);
        this.f47200Oooo0o = eventCreateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        this.f47200Oooo0o.setShowPermission(false);
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            EventCreateViewModel eventCreateViewModel = this.f47200Oooo0o;
            String string = uriOooO0O0.toString();
            Intrinsics.checkNotNullExpressionValue(string, "it.toString()");
            eventCreateViewModel.setHeadPath(string);
            eventCreateViewModel.setHeadUrl("");
        }
        return Unit.INSTANCE;
    }
}
