package com.twitter;

import o0O0O00.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class Extractor {

    public static class Entity {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f19932OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f19933OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f19934OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Type f19935OooO0Oo;

        public enum Type {
            URL,
            HASHTAG,
            MENTION,
            CASHTAG
        }

        public Entity(int i, int i2, String str, Type type) {
            this.f19932OooO00o = i;
            this.f19933OooO0O0 = i2;
            this.f19934OooO0OO = str;
            this.f19935OooO0Oo = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entity)) {
                return false;
            }
            Entity entity = (Entity) obj;
            return this.f19935OooO0Oo.equals(entity.f19935OooO0Oo) && this.f19932OooO00o == entity.f19932OooO00o && this.f19933OooO0O0 == entity.f19933OooO0O0 && this.f19934OooO0OO.equals(entity.f19934OooO0OO);
        }

        public final int hashCode() {
            return this.f19934OooO0OO.hashCode() + this.f19935OooO0Oo.hashCode() + this.f19932OooO00o + this.f19933OooO0O0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f19934OooO0OO);
            sb.append("(");
            sb.append(this.f19935OooO0Oo);
            sb.append(") [");
            sb.append(this.f19932OooO00o);
            sb.append(",");
            return o0ooOOo.OooO00o(sb, this.f19933OooO0O0, "]");
        }
    }
}
