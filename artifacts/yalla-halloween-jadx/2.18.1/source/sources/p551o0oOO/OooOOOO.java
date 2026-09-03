package p551o0oOO;

import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p156o00OoO0.OooOOO;
import p156o00OoO0.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends OooOOO<OooOOOO> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<OooO00o> f44615OooO0o0 = new ArrayList();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f44616OooO00o = ShareInternalUtility.STAGING_PARAM;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f44617OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public File f44618OooO0OO;

        public OooO00o(String str, File file) {
            this.f44617OooO0O0 = str;
            this.f44618OooO0OO = file;
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FileInput{key='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f44616OooO00o, '\'', ", filename='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f44617OooO0O0, '\'', ", file=");
            sbOooO0o0.append(this.f44618OooO0OO);
            sbOooO0o0.append('}');
            return sbOooO0o0.toString();
        }
    }

    @Override // p551o0oOO.OooOOO
    public final OooOOO OooO0O0() {
        return new OooOOO(new OooOOO0(this.f44611OooO00o, this.f44612OooO0O0, this.f44614OooO0Oo, this.f44613OooO0OO, this.f44615OooO0o0));
    }
}
