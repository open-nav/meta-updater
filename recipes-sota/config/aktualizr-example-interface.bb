SUMMARY = "Aktualizr example interface"
DESCRIPTION = "Aktualizr example interface for legacy secondaries"
HOMEPAGE = "https://github.com/advancedtelematic/aktualizr"
SECTION = "base"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = " \
            file://30-example-interface.toml \
            "

do_install_append () {
    install -m 0700 -d ${D}${libdir}/sota/conf.d
    install -m 0644 ${WORKDIR}/30-example-interface.toml ${D}${libdir}/sota/conf.d/30-example-interface.toml
}

FILES_${PN} = " \
                ${libdir}/sota/conf.d/30-example-interface.toml \
                "

# vim:set ts=4 sw=4 sts=4 expandtab:
