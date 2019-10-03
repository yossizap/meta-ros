# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A ROS node that controls a Linksys access point with     a Linksys WRT610n-compatible web interface."
AUTHOR = "Devon Ash <dash@clearpathrobotics.com>"
ROS_AUTHOR = "Catalin Drula"
HOMEPAGE = "http://ros.org/wiki/linksys_access_point"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "linux_networking"
ROS_BPN = "linksys_access_point"

ROS_BUILD_DEPENDS = " \
    access-point-control \
    dynamic-reconfigure \
    ieee80211-channels \
    rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    access-point-control \
    dynamic-reconfigure \
    ieee80211-channels \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    access-point-control \
    dynamic-reconfigure \
    ieee80211-channels \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/linksys_access_point/1.0.13-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "668741dcad8d9c4dc8f23ee2996f8964"
SRC_URI[sha256sum] = "7bda12e4d3aeb0d720f2771e17fd000c1cc7722a73e5ef237f261472ea0643b3"
S = "${WORKDIR}/linux_networking-release-release-melodic-linksys_access_point-1.0.13-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('linux-networking', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('linux-networking', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/linux-networking/linux-networking_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/linux-networking/linux-networking-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/linux-networking/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/linux-networking/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}