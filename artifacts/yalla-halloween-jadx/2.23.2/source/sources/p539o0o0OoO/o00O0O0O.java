package p539o0o0OoO;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o000000;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0O extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f54557OooO0o0;

    public o00O0O0O(MutableState<TextFieldValue> mutableState) {
        this.f54557OooO0o0 = mutableState;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        MutableLiveData<Integer> mutableLiveData = OooO0O0.f24533OoooOOO.OooO00o().f24552OooOOo0;
        MutableState<TextFieldValue> mutableState = this.f54557OooO0o0;
        mutableLiveData.postValue(Integer.valueOf(o000000.OooO0o0(mutableState.getValue().getText())));
        String dues = mutableState.getValue().getText();
        Intrinsics.checkNotNullParameter(dues, "dues");
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(10041, "{\"dues\":" + dues + "}");
        }
    }
}
