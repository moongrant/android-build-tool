package p475o0Ooooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000000;
import com.yalla.yalla.model.http.Error;
import com.yalla.yalla.model.http.Response;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public class oO0O000o {
    @NotNull
    public static Response OooO00o(@Nullable String str, @Nullable String str2) {
        return new Response(false, null, false, new Error(str != null ? Integer.valueOf(o000000.OooO0o0(str)) : null, str2), 6, null);
    }

    @NotNull
    public static Response OooO0O0(@Nullable Response response) {
        Object data = response != null ? response.getData() : null;
        List list = data instanceof List ? (List) data : null;
        return new Response(true, response != null ? response.getData() : null, list == null || list.size() < response.getPage().getPageSize(), null, 8, null);
    }
}
