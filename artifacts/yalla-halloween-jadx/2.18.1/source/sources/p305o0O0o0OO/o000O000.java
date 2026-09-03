package p305o0O0o0OO;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteArrayOutputStream f36244OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DataOutputStream f36245OooO0O0;

    public o000O000() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f36244OooO00o = byteArrayOutputStream;
        this.f36245OooO0O0 = new DataOutputStream(byteArrayOutputStream);
    }

    public static void OooO00o(DataOutputStream dataOutputStream, long j) throws IOException {
        dataOutputStream.writeByte(((int) (j >>> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        dataOutputStream.writeByte(((int) (j >>> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        dataOutputStream.writeByte(((int) (j >>> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        dataOutputStream.writeByte(((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
    }
}
