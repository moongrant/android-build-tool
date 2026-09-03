package androidx.renderscript;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class RenderScript {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f9259OooO00o = 0;

    public enum ContextType {
        NORMAL(0),
        DEBUG(1),
        PROFILE(2);

        public int mID;

        ContextType(int i) {
            this.mID = i;
        }
    }

    public enum Priority {
        LOW(15),
        NORMAL(-4);

        public int mID;

        Priority(int i) {
            this.mID = i;
        }
    }

    static {
        new ArrayList();
    }
}
