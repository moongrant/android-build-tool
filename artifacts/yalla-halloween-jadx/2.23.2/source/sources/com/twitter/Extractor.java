package com.twitter;

import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class Extractor {

    public static class Entity {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f21482OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f21483OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f21484OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Type f21485OooO0Oo;

        public enum Type {
            URL,
            HASHTAG,
            MENTION,
            CASHTAG
        }

        public Entity(int i, int i2, String str, Type type) {
            this.f21482OooO00o = i;
            this.f21483OooO0O0 = i2;
            this.f21484OooO0OO = str;
            this.f21485OooO0Oo = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entity)) {
                return false;
            }
            Entity entity = (Entity) obj;
            return this.f21485OooO0Oo.equals(entity.f21485OooO0Oo) && this.f21482OooO00o == entity.f21482OooO00o && this.f21483OooO0O0 == entity.f21483OooO0O0 && this.f21484OooO0OO.equals(entity.f21484OooO0OO);
        }

        public final int hashCode() {
            return this.f21484OooO0OO.hashCode() + this.f21485OooO0Oo.hashCode() + this.f21482OooO00o + this.f21483OooO0O0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21484OooO0OO);
            sb.append("(");
            sb.append(this.f21485OooO0Oo);
            sb.append(") [");
            sb.append(this.f21482OooO00o);
            sb.append(",");
            return OooOO0.OooO00o(sb, this.f21483OooO0O0, "]");
        }
    }
}
