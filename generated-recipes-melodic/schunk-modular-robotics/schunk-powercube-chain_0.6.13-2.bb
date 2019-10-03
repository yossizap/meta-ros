# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This packages provides a configurable driver of a chain   of Schunk powercubes. The powercube chain is configured   through parameters. Most users will not directly interact   with this package but with the corresponding launch files   in other packages, e.g. schunk_bringup, cob_bringup, ..."
AUTHOR = "Florian Weisshardt <fmw@ipa.fhg.de>"
ROS_AUTHOR = "Florian Weisshardt <fmw@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/schunk_powercube_chain"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "schunk_modular_robotics"
ROS_BPN = "schunk_powercube_chain"

ROS_BUILD_DEPENDS = " \
    cob-srvs \
    control-msgs \
    diagnostic-msgs \
    libntcan \
    libpcan \
    roscpp \
    schunk-libm5api \
    sensor-msgs \
    std-msgs \
    std-srvs \
    trajectory-msgs \
    urdf \
    virtual/kernel \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cob-srvs \
    control-msgs \
    diagnostic-msgs \
    libntcan \
    libpcan \
    roscpp \
    schunk-libm5api \
    sensor-msgs \
    std-msgs \
    std-srvs \
    trajectory-msgs \
    urdf \
    virtual/kernel \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cob-srvs \
    control-msgs \
    diagnostic-msgs \
    libntcan \
    libpcan \
    roscpp \
    schunk-libm5api \
    sensor-msgs \
    std-msgs \
    std-srvs \
    trajectory-msgs \
    urdf \
    virtual/kernel \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipa320/schunk_modular_robotics-release/archive/release/melodic/schunk_powercube_chain/0.6.13-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "df3e642f6f2179e0d5264420a84515a2"
SRC_URI[sha256sum] = "805d6614d5110463ddd7871aea6cff7460d8200a572feaf35f003a31475939c2"
S = "${WORKDIR}/schunk_modular_robotics-release-release-melodic-schunk_powercube_chain-0.6.13-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('schunk-modular-robotics', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('schunk-modular-robotics', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/schunk-modular-robotics/schunk-modular-robotics_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/schunk-modular-robotics/schunk-modular-robotics-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/schunk-modular-robotics/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/schunk-modular-robotics/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}