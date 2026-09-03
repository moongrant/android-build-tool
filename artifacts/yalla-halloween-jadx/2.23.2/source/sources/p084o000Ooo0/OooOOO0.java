package p084o000Ooo0;

import androidx.media3.common.util.UnstableApi;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteArrayOutputStream f35003OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DataOutputStream f35004OooO0O0;

    public OooOOO0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(ConstantsKt.MINIMUM_BLOCK_SIZE);
        this.f35003OooO00o = byteArrayOutputStream;
        this.f35004OooO0O0 = new DataOutputStream(byteArrayOutputStream);
    }
}
